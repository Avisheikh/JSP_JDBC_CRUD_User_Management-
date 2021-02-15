/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import DOA.ReportDOA;
import Model.Client;
import Model.History;
import Model.Report;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "ReportServlet", urlPatterns = {"/ReportServlet"})
public class ReportServlet extends HttpServlet {

   
   private ReportDOA doa;
   

    
    @Override
    public void init()throws ServletException
    {
    
        super.init();
        
        try
        {
        
        //creating object to admin doa class
            doa= new ReportDOA();
        
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
            String theCommand = request.getParameter("reportCommand");
        
            ///if the command is missing, then default to register page
            if(theCommand == null)
            {
          RequestDispatcher dispatcher = request.getRequestDispatcher("pages/index.jsp");
                dispatcher.forward(request,response);
            }
            
            //route to the approprate method
            switch(theCommand)
            {
                
                case "dateList":
                    createDate(request,response);
                    break;
                    
                case "totalCreatedUser":
                    totalCreatedDate(request,response);
                    
                 
                 case "totalDeletedUser":
                    totalDeletedDate(request,response);
                    
               
            
                    
                default:
                RequestDispatcher dispatcher = request.getRequestDispatcher("pages/index.jsp");
                dispatcher.forward(request,response);
                     
            
            }
                    
            
        }
        catch(Exception exc)
        {
        throw new ServletException(exc);
        }
        
            
        
    }

    private void createDate(HttpServletRequest request, HttpServletResponse response) throws Exception {
       
        //get client report
        
        List<Report> clientHistory = doa.getClientReport();
        
        //add history to the request
        request.setAttribute("client_report", clientHistory);
        
      
        
        
        
         RequestDispatcher dispatcher = request.getRequestDispatcher("pages/report.jsp");
                dispatcher.forward(request,response);
                     
        
    }

    private void totalCreatedDate(HttpServletRequest request, HttpServletResponse response) throws Exception {
      
        //read client userName from form data
        String fromDate = request.getParameter("from");
        String toDate = request.getParameter("to");
        
        
        //get client from database
         List<Report> theReport = doa.getTotalCreated(fromDate, toDate);
        
        //place client in the request attribute
        request.setAttribute("theReport", theReport);
        
        
        //send to jsp page 
    RequestDispatcher dispatcher = request.getRequestDispatcher("pages/creationReport.jsp");
    dispatcher.forward(request, response);
        
        
        
        
    }

    private void totalDeletedDate(HttpServletRequest request, HttpServletResponse response) throws Exception {
     
           //read client userName from form data
        String fromDate = request.getParameter("from2");
        String toDate = request.getParameter("to2");
        
        
        //get client from database
         List<Report> theReport1 = doa.getTotalDeleted(fromDate, toDate);
        
        //place client in the request attribute
        request.setAttribute("delReport", theReport1);
        
        
        //send to jsp page 
    RequestDispatcher dispatcher = request.getRequestDispatcher("pages/deleteReport.jsp");
    dispatcher.forward(request, response);
        
        
        
        
    }
    
     
    
    
    

}
