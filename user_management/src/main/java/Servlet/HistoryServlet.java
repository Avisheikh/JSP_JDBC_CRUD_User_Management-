/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DOA.AdminDbUtil;
import DOA.ClientDbUtil;
import DOA.HistoryDOA;
import Model.Client;
import Model.History;
import Model.adminHistory;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "HistoryServlet", urlPatterns = {"/HistoryServlet"})
public class HistoryServlet extends HttpServlet {

 private HistoryDOA doa;
    
    
    @Override
    public void init()throws ServletException
    {
    
        super.init();
        
        try
        {
        
        //creating object of  classes
        
            
           doa = new HistoryDOA();
        }
        catch(Exception exc)
        {
            
        //handling error
        throw new ServletException(exc);
        
        }
    
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        //get history from db util
            //list the admin .... in MVC fashion
         
         try{
             //read the "command" parameter
             String theCommand = request.getParameter("command");
             
             //if the command is missing , then defaulr to listing user
             
             if(theCommand == null)
             {
              RequestDispatcher dispatcher = request.getRequestDispatcher("pages/dashboard.jsp");
        dispatcher.forward(request,response);
        
             }
             
             //route to the approprate method
             switch(theCommand)
             {
                 case "clientHistory":
                     clientHistory(request,response);
                     break;
                     
                 
                     
                 case "adminHistory":
                     adminHistory(request,response);
                     break;
                     
                     
                
                     
                 default:
                  RequestDispatcher dispatcher = request.getRequestDispatcher("pages/dashboard.jsp");
        dispatcher.forward(request,response);
        
                     
                   
                     
             
             }
             
         }catch(Exception exc)
         {throw new ServletException(exc);}
 
        
        
        
    }

    private void clientHistory(HttpServletRequest request, HttpServletResponse response) throws Exception {
      
        //read userName from jsp
        String userName  = request.getParameter("userName");
        
        
        
        
        //get client history 
        
        List<History> clientHistory = doa.getClientHistory(userName);
        
        //add history to the request
        request.setAttribute("client_history", clientHistory);
        
        //send to jsp page
         RequestDispatcher dispatcher = request.getRequestDispatcher("pages/historyPage.jsp");
        dispatcher.forward(request,response);
        
        
        
        
        
        
        
        
    }

    private void adminHistory(HttpServletRequest request, HttpServletResponse response)throws Exception, ServletException {
        //read userName from jsp
        String userName  = request.getParameter("adminUserName");
         
         
                List<adminHistory> specifiAdminHistory = doa.getSpecificAdminHistory(userName);
                
        List<adminHistory> adminHistory = doa.getAdminHistory();
      
          List<History> clientHistory = doa.getClientHistoryList();
          
         
        
        //add history to the request
        request.setAttribute("admin_history", adminHistory);
            request.setAttribute("adminHistory", specifiAdminHistory);
         request.setAttribute("aclient_history", clientHistory);
        
        //send to jsp page
         RequestDispatcher dispatcher = request.getRequestDispatcher("pages/adminHistoryPage.jsp");
        dispatcher.forward(request,response);
        
    }
    
    
    
    
    
    

}
