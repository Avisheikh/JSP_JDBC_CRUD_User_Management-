/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import Model.Client;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

import DOA.AdminDbUtil;
import DOA.ClientDbUtil;
import DOA.ReportDOA;
import Model.Report;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpSession;

/**
 *
 * @author abishek
 */
@WebServlet(name = "ClientControllerServlet", urlPatterns = {"/ClientControllerServlet"})
public class ClientControllerServlet extends HttpServlet {
    
    private ClientDbUtil doa;
    private ReportDOA rDOA;

   
    
    @Override
    public void init()throws ServletException
    {
    
        super.init();
        
        try
        {
        
        //creating object to admin doa class
            doa= new ClientDbUtil();
            rDOA = new ReportDOA();
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
            String theCommand = request.getParameter("command");
        
            ///if the command is missing, then default to register page
            if(theCommand == null)
            {
          RequestDispatcher dispatcher = request.getRequestDispatcher("pages/register.jsp");
                dispatcher.forward(request,response);
            }
            
            //route to the approprate method
            switch(theCommand)
            {
                
                case "LIST":
                    listClient(request,response);
                    break;
                
                    
                case "LOAD":
                    loadClient(request,response);
                    break;
                
                case "REGISTER":
                    addClient(request,response);
                    break;
                    
                case "UPDATE":
                    updateClient(request,response);
                    break;
            
                    
                case "DELETE":
                    delClient(request,response);
                    break;
                    
                    
                case "History":
                    
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
    
    

    private void addClient(HttpServletRequest request, HttpServletResponse response) throws Exception {
      
       
        String errorMessage = "";
      
        
        
    //read client info from form data
    String firstName = request.getParameter("fName");
    String lastName = request.getParameter("lName");
    String email = request.getParameter("email");
    String address = request.getParameter("address");
    String userName = request.getParameter("userName");
    String dob = request.getParameter("dob");
    String password = request.getParameter("pass1");
    String rePassword = request.getParameter("pass2");
    
    if(password.length() < 5 || password.length() > 11 ){
              errorMessage = "Minimum Length For Password Should Be Five Character And Maximum Length Should Be Ten Character";

        }
    
    if(!password.equals(rePassword))
    {
    errorMessage = "Password And Confirm Password Did Not Match";
    
    }
    
    
    
    if(errorMessage.compareTo("") != 0)
    {
    request.setAttribute("errorMessage",errorMessage);
    RequestDispatcher dispatcher = request.getRequestDispatcher("pages/register.jsp");
    dispatcher.forward(request,response);
    }
    
    else{
    
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
           LocalDateTime now = LocalDateTime.now();  
         String date =  dtf.format(now);

           
    //create a new client and report class object
    Client theClient = new Client(firstName,lastName,address,userName,email,dob,password,rePassword);
    Report createDateReport = new Report(firstName,lastName,userName,date,null); 
    
    
    //add the client and report to the database
    doa.addClient(theClient);
    rDOA.createdDate(createDateReport);
    
     
   
    
    //send back to main page
        RequestDispatcher dispatcher = request.getRequestDispatcher("pages/success.jsp");
        dispatcher.forward(request,response);
    
    }
        
  
      
    
    
    
    
    
    }

    public void listClient(HttpServletRequest request, HttpServletResponse response)throws Exception {
        
        //get client from user util
        List<Client> clients = doa.getClient();
        
        //add client to the request
        request.setAttribute("client_list", clients);
        
        //send to JSP page(View)
        RequestDispatcher dispatcher = request.getRequestDispatcher("pages/listClient.jsp");
        dispatcher.forward(request,response);
        
        
        
        
        
    }

    private void loadClient(HttpServletRequest request, HttpServletResponse response) throws Exception {
       
      
        
        //read client userName from form data
        String theClientName = request.getParameter("userName");
        
        
        //get client from database
        Client theClient = doa.getUser(theClientName);
        
        //place client in the request attribute
        request.setAttribute("THE_CLIENT", theClient);
        
        
        //send to jsp page 
    RequestDispatcher dispatcher = request.getRequestDispatcher("pages/profile.jsp");
    dispatcher.forward(request, response);
    
    
    
    
    
    }

    private void updateClient(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        
     
  
      
        
        
    //read client info from form data
    int id = Integer.parseInt(request.getParameter("uID"));
    String firstName = request.getParameter("fName");
    String lastName = request.getParameter("lName");
    String email = request.getParameter("email");
     String userName = request.getParameter("userName");
    String address = request.getParameter("address");
    String dob = request.getParameter("dob");
    String password = request.getParameter("pass1");
    String rePassword = request.getParameter("pass2");
    
    //place client in the request attribute
       
    
    

       
    //create a new client object
    Client theClient = new Client(id,firstName,lastName,address,userName,email,dob,password,rePassword);
    
    //add the client to the database
    doa.updateClient(theClient);
    
     
   
    
    //send back to loadClinet
      loadClient(request,response);
    
    }

    private void delClient (HttpServletRequest request, HttpServletResponse response) throws Exception {
        //read client id from form data
        String theUserId = request.getParameter("adminId");
        String userName = request.getParameter("clientUserName");
        String firstName = request.getParameter("clientFirstName");
        String lastName = request.getParameter("clientLastName");
        
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");  
           LocalDateTime now = LocalDateTime.now();  
         String date =  dtf.format(now);
         
         
        //create report obj
        Report createDeleteReport = new Report(firstName,lastName,userName,null,date);
         
        
        
        //delete client from database and send date to report
        doa.delUser(theUserId);
        rDOA.deleteUserReport(createDeleteReport);
        
        
        
        //send them back to index page
       RequestDispatcher dispatcher = request.getRequestDispatcher("pages/deleteSuccess.jsp");
    dispatcher.forward(request, response);
    }
        
  
      
    
        
        
        
        
        
        
        
        
    }

   

  
    
    
    
    

