
package Servlet;

import Model.Admin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import DOA.AdminDbUtil;
import java.util.List;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author abishek
 */
@WebServlet(name = "UserControllerServlet", urlPatterns = {"/UserControllerServlet"})
public class AdminControllerServlet extends HttpServlet {
    
    private AdminDbUtil doa;
    

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
        
        try{
        doa = new AdminDbUtil();
        }
        catch(Exception exc)
        {
        throw new ServletException(exc);
        }
        
    }
    
    

   
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
         //list the admin .... in MVC fashion
         
         try{
             //read the "command" parameter
             String theCommand = request.getParameter("command");
             
             //if the command is missing , then defaulr to listing user
             
             if(theCommand == null)
             {
              RequestDispatcher dispatcher = request.getRequestDispatcher("pages/adminDashboard.jsp");
        dispatcher.forward(request,response);
        
             }
             
             //route to the approprate method
             switch(theCommand)
             {
                 case "LIST":
                     listUser(request,response);
                     break;
                     
                 
                     
                 case "LOAD":
                     loadUser(request,response);
                     break;
                     
                     
                 case "UPDATE":
                     updateUser(request,response);
                     break;
                     
                 case "DELETE":
                     delUser(request,response);
                     break;
                     
                     
                     
                     
                     
                 default:
                  RequestDispatcher dispatcher = request.getRequestDispatcher("pages/adminDashboard.jsp");
        dispatcher.forward(request,response);
        
                     
                   
                     
             
             }
             
         }catch(Exception exc)
         {throw new ServletException(exc);}
         
         
         
         
         
   }

    public void listUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
        
        //get admin from db util and Createing an array list of admin which store all the details of admin who have been added
        PrintWriter out = response.getWriter();
        List<Admin> users = doa.getUser();
        
        
        //add admin array list obj to the request
        request.setAttribute("user_list", users);
        
        //send to JSP page(view)
        RequestDispatcher dispatcher = request.getRequestDispatcher("pages/adminDashboardUserMangement.jsp");
        dispatcher.forward(request,response);
        
        
        
        
        
    }

    

    private void updateUser(HttpServletRequest request, HttpServletResponse response) throws Exception {
      
        //read admin info from the data
        
        int id = Integer.parseInt(request.getParameter("uID"));
        String firstName = request.getParameter("fName");
        String lastName = request.getParameter("lName");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String userName = request.getParameter("userName");
        String dob = request.getParameter("dob");
        String password = request.getParameter("pass1");
        String rePassword = request.getParameter("pass2");
        //crreate a new admin object
        Admin theUser = new Admin(id,firstName,lastName,address,userName,email,dob,password,rePassword);
		
		// perform update on database
		doa.updateUser(theUser);
		
		// send them back to the "list admin" page
		listUser(request, response);
        
        
    }

    private void loadUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
      
        //read admin id from form data
        String theUserId = request.getParameter("adminUserName");
        
        //get admin from database(db util)
        Admin theUser = doa.getUser(theUserId);
        
        
        //place admin in the request attribute
        request.setAttribute("THE_ADMIN", theUser);
        
        //send to jsp page update-user-form.jsp
        RequestDispatcher dispatcher = request.getRequestDispatcher("pages/adminUpdate.jsp");
        dispatcher.forward(request, response);
        
    }

    private void delUser(HttpServletRequest request, HttpServletResponse response) throws Exception{
    
        
        //read admin id from form data
        String theUserId = request.getParameter("adminId");
        
        
        
        //delete admin from database
        doa.delUser(theUserId);
        
        //send them back to "list admin" page
       listUser(request, response);
        
        
        
        
    }

   

}
