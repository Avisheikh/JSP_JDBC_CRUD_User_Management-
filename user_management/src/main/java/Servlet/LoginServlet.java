/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Client;
import DOA.ClientDbUtil;
import DOA.HistoryDOA;
import DOA.LoginDOA;
import Model.Admin;
import Model.History;
import Model.adminHistory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author abishek
 */
@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class LoginServlet extends HttpServlet {

    
       private LoginDOA doa;
   
       private HistoryDOA hDOA;
    
    @Override
    public void init()throws ServletException
    {
    
        super.init();
        
        try
        {
        
        //creating object to admin doa class
            doa= new LoginDOA();
            hDOA = new HistoryDOA();
        }
        catch(Exception exc)
        {
            
        //handling error
        throw new ServletException(exc);
        
        }
    
    }
    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      
        doPost(request,response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    
        
        //list the client in the MVC fashion
        
        try
        {
            //read the "command" parameter
            String theCommand = request.getParameter("logincommand");
        
            ///if the command is missing, then default to register page
            if(theCommand == null)
            {
          RequestDispatcher dispatcher = request.getRequestDispatcher("pages/login.jsp");
                dispatcher.forward(request,response);
            }
            
            //route to the approprate method
            switch(theCommand)
            {
                
                case "VALIDATE":
                    validateUser(request,response);
                    break;
                    
                case "FORGET":
                    forgetPassword(request,response);
                    break;
                    
                case "RESET":
                        resetPassword(request,response);
                        break;
            
            
                    
                default:
                RequestDispatcher dispatcher = request.getRequestDispatcher("pages/register.jsp");
                dispatcher.forward(request,response);
                     
            
            }
                    
            
        }
        catch(Exception exc)
        {
        throw new ServletException(exc);
        }
        
            
        
    }
    
    
    
    
    

    private void validateUser(HttpServletRequest request, HttpServletResponse response) {
          
        //read user info from the form
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");
        
        
        
        //create a new user object
        Client theClient = new Client(userName,password);
        Admin theAdmin = new Admin(userName,password);
      
       
           try {
               if (doa.validate(theClient))
               {
                   
              HttpSession session = request.getSession(true); 
              
              //get session creation time
              Date time = new Date(session.getCreationTime());
              DateFormat creationFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
              String creationTime = creationFormat.format(time);
              
              
              //get lastAccessTime 
              Date lastAccessTime = new Date(session.getLastAccessedTime());
              DateFormat lastAccessFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
              String lastAccess = lastAccessFormat.format(lastAccessTime);
              
              
              
              session.setAttribute("cUserName", theClient.getUserName());
              session.setAttribute("time", creationTime);
              session.setMaxInactiveInterval(30); // Keep the page ideal for 30 seconds 
                   
              
              
              //creating history  obj
              History historyObj = new History(userName,creationTime,lastAccess);
              hDOA.addHistory(historyObj);
              
                 //send to jsp page 
                       RequestDispatcher dispatcher = request.getRequestDispatcher("pages/dashboard.jsp");
                   dispatcher.forward(request, response);
                   
               }
               
               else if (doa.validateAdmin(theAdmin))
               {
               
                   // reuse existing session if exist or create one
                   HttpSession session = request.getSession(true);
                   request.setAttribute("aUserName",theAdmin);
                   
                   
                    //get session creation time
              Date time = new Date(session.getCreationTime());
              DateFormat creationFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
              String creationTime = creationFormat.format(time);
              
              
              //get lastAccessTime 
              Date lastAccessTime = new Date(session.getLastAccessedTime());
              DateFormat lastAccessFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss"); 
              String lastAccess = lastAccessFormat.format(lastAccessTime);
              
              
                            
              //creating history  obj
              adminHistory historyObj = new adminHistory(userName,creationTime,lastAccess);
              hDOA.adminHistory(historyObj);
              
                   
                   
                   
                   
                    session.setMaxInactiveInterval(30); // Keep the page ideal for 30 seconds 
                   
                   RequestDispatcher dispatcher = request.getRequestDispatcher("pages/adminDashboard.jsp");
                   dispatcher.forward(request, response);
                   
               
               }
               
               
               else
               {
                   RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
                   rd.include(request, response);
                   
               }
           } catch (Exception ex) {
              ex.printStackTrace();
           }
    }

    private void forgetPassword(HttpServletRequest request, HttpServletResponse response) throws Exception {

      // getting values from jsp pages
      String firstName = request.getParameter("firstName");
        String userName = request.getParameter("userName");
        String email = request.getParameter("email");
        String dob = request.getParameter("dob");
        
        // create a new object 
        
        Client forgetPasswordObj = new Client(firstName,userName,email,dob);
        
     
       if( doa.validateClient(forgetPasswordObj))
       {
         request.setAttribute("fUserName", forgetPasswordObj);
         RequestDispatcher rd = request.getRequestDispatcher("pages/resetPassword.jsp");
                   rd.include(request, response);
       
       }
       else
       {
       
       
          RequestDispatcher rd = request.getRequestDispatcher("pages/infoNotValid.jsp");
                   rd.include(request, response);
       
       
       
       }
        
        
        
        
    }

    private void resetPassword(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        //Get values from jsp page
        String userName = request.getParameter("fGetUserName");
        String password = request.getParameter("pass1");
        String rePassword = request.getParameter("pass2");
        
        //create a new object
        Client resetPasswordObj = new Client(userName,password,rePassword);
        
          //set the obj to send the information to database
          doa.resetClientPassword(resetPasswordObj);
        
        
         RequestDispatcher rd = request.getRequestDispatcher("pages/successReset.jsp");
                   rd.forward(request, response);
        
        
        
       
    }
    
    


    
   
}
