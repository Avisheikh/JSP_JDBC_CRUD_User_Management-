/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author abish
 */
@WebServlet(name = "LogoutServlet", urlPatterns = {"/LogoutServlet"})
public class LogoutServlet extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO Auto-generated method stub
//      response.setContentType("text/html");
//      PrintWriter out = response.getWriter();
//      out.println(" session was destroyed successfully!!");

      HttpSession session = request.getSession(false);
      // session.setAttribute("user", null);
     
  
      
    response.setHeader("Cache-Control","no-cache");
            response.setHeader("Cache-Control","no-store");
response.setHeader("Pragma","no-cache");
response.setDateHeader ("Expires", 0);  

if(session.getAttribute("token")==null){
        session.removeAttribute("sUserName");
    session.invalidate();
     session.getMaxInactiveInterval();
    response.sendRedirect(request.getContextPath() + "/index.jsp");

}
                   
                   
                   
    }

    

}
