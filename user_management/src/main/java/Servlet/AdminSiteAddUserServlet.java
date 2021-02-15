/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DOA.AdminDbUtil;
import DOA.ClientDbUtil;
import Model.Admin;
import Model.Client;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author abish
 */
@WebServlet(name = "AdminSiteAddUserServlet", urlPatterns = {"/AdminSiteAddUserServlet"})
public class AdminSiteAddUserServlet extends HttpServlet {
    
    private AdminDbUtil aDOA;
    private ClientDbUtil cDOA;
    private AdminControllerServlet cS;
    
    
    @Override
    public void init()throws ServletException
    {
    
        super.init();
        
        try
        {
        
        //creating object of  classes
        
            
            aDOA = new AdminDbUtil();
            cDOA= new ClientDbUtil();
            cS = new AdminControllerServlet();
        }
        catch(Exception exc)
        {
            
        //handling error
        throw new ServletException(exc);
        
        }
    
    }
    
    

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
        //get value from jsp page
        int userType = Integer.parseInt(request.getParameter("userType"));
       
    
        
try{
        //check user type admin or client
        switch (userType) {
            case 1:
                

                    addAdmin(request,response);
                break;
                
            case 2:
                addClient(request,response);

               break;
            default:
                RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
                dispatcher.forward(request,response);
                break;
        }
}
  catch (Exception ex) {
                   throw new ServletException(ex);
                }  
        
        
        
    }

    private void addAdmin(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
       //Get Parameter value from get method
        String firstName = request.getParameter("fName");
        String lastName = request.getParameter("lName");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String userName = request.getParameter("userName");
        String dob = request.getParameter("dob");
        String password = request.getParameter("pass1");
        String rePassword = request.getParameter("pass2");


        


         //crreate a new admin object
        Admin theUser = new Admin(firstName,lastName,address,userName,email,dob,password,rePassword);
         //add the admin to the database
         aDOA.addUser(theUser);
         //send back to main page
          RequestDispatcher dispatcher = request.getRequestDispatcher("pages/success.jsp");
                    dispatcher.forward(request,response);
    }
    
    

    private void addClient(HttpServletRequest request, HttpServletResponse response) throws Exception {
     
         //Get Parameter value from get method       

        String firstName = request.getParameter("fName");
        String lastName = request.getParameter("lName");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String userName = request.getParameter("userName");
        String dob = request.getParameter("dob");
        String password = request.getParameter("pass1");
        String rePassword = request.getParameter("pass2");



         //create a new client object
                Client theClient = new Client(firstName,lastName,address,userName,email,dob,password,rePassword);
               
        //add the client to the database
        cDOA.addClient(theClient);
        
         //send back to main page
         RequestDispatcher dispatcher = request.getRequestDispatcher("pages/success.jsp");
                    dispatcher.forward(request,response);
               
                
              
    }

    
    
    
    
    
    
}
