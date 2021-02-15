/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DOA;

/**
 *
 * @author abishek
 */


import JDBC_Connection.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Admin;
import Model.Client;
import Model.History;
import Model.Report;
import Model.adminHistory;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ReportDOA {
    
    private Connection conn;
    
    public ReportDOA()
    {
    conn = ConnectionProvider.getConnection();
    
    }
    
    
    private void close(Connection conn, Statement stm, ResultSet rs) {
        try {
        if(rs != null)
        {
        rs.close();
        }
        
        if (stm != null)
        {
        
        stm.close();
        }
        
        if (conn != null)
        {
        rs.close();
        }
        
        
        
        }
        
        catch(Exception exc)
        {exc.printStackTrace();}
    }

    public void createdDate(Report createDateReport) throws Exception {
      
          PreparedStatement  stm = null;
      
      try{
      //create sql query and get connection to insert the query
      String sql = "insert into report"
                        +"(firstName,lastName,userName,creationDate)"
                        +"values(?,?,?,?)";
        
      stm = conn.prepareStatement(sql);
      
      //set the param values from history
      stm.setString(1, createDateReport.getFirstName());
      stm.setString(2, createDateReport.getLastName());
      stm.setString(3, createDateReport.getUserName());
      stm.setString(4, createDateReport.getCreationDate());
    
      
      
      //excute query
      stm.execute();}
      
      finally{
      
       //clean up JDBC objects
         close(conn,stm,null);
         
      
      }
      
        
        
        
        
        
    }

    public void deleteUserReport(Report createDeleteReport) throws Exception {
        PreparedStatement  stm = null;
      
      try{
      //create sql query and get connection to insert the query
      String sql = "insert into report"
                        +"(firstName,lastName,userName,deleteDate)"
                        +"values(?,?,?,?)";
        
      stm = conn.prepareStatement(sql);
      
      //set the param values from history
      stm.setString(1, createDeleteReport.getFirstName());
      stm.setString(2, createDeleteReport.getLastName());
      stm.setString(3, createDeleteReport.getUserName());
      stm.setString(4, createDeleteReport.getDeleteDate());
    
      
      
      //excute query
      stm.execute();}
      
      finally{
      
       //clean up JDBC objects
         close(conn,stm,null);
         
      
      }
      
    }

    public List<Report> getClientReport() throws Exception {
       
        
         List<Report> clients = new ArrayList<>();
        
        Statement stm = null;
        ResultSet rs = null;
        
        
        try{
        //create sql statement and get connection
        
        String sql = "select * from report";
        stm = conn.createStatement();
        
        //excute query
        rs = stm.executeQuery(sql);
        
        //process result set
        while(rs.next())
        {
            //retrieve data from result set row
        int id = rs.getInt("reportId");
        String firstName = rs.getString("firstName");
        String lastName = rs.getString("lastName");
        String userName = rs.getString("userName");
        String creationDate = rs.getString("creationDate");
        String deleteDate = rs.getString("deleteDate");
        
        
        //create new client object
        Report tempClient = new Report(id,firstName,lastName,userName,creationDate,deleteDate);
        
        //add it to the list of client
        clients.add(tempClient);
        
        
        }
        return clients;
        }
        finally{
        //close JDBC objects
        close(conn,stm,rs);
        
        }
        
        
        
        
    }

    public  List<Report> getTotalCreated(String fromDate, String toDate) throws Exception {
       
        
    List<Report> creationReport = new ArrayList<>();
     
        PreparedStatement stm = null;
        ResultSet rs = null;
        String count = null;
      
        
        try{
        String fromCreatedDate = fromDate;
        String toCreatedDate = toDate;
        
        //create sql to get the selected client
        String sql = "SELECT * FROM report WHERE creationDate BETWEEN ? and ? ";
        
        //create prepared statement
        stm = conn.prepareStatement(sql);
        
        //set params
        stm.setString(1,fromCreatedDate);
        stm.setString(2,toCreatedDate);
        
        
        //execute statement
       rs=stm.executeQuery();
        
       while(rs.next())
       {
       
        //retrieve data from result set row
        int id = rs.getInt("reportId");
        String firstName = rs.getString("firstName");
        String lastName = rs.getString("lastName");
        String userName = rs.getString("userName");
        String creationDate = rs.getString("creationDate");
        String deleteDate = rs.getString("deleteDate");
        
        
        //create new client object
        Report createdReport = new Report(id,firstName,lastName,userName,creationDate,deleteDate);
        
             
        //add it to the list of client
        creationReport.add(createdReport);
     
       }
      
        
       
        
        
        return creationReport;
        
      
        
        }
        finally 
        {
        //clean up the JDBC objects
            close(conn,stm,null);
        
        
        } 
        
        
        
    }

    public List<Report> getTotalDeleted(String fromDate, String toDate) throws Exception {
         List<Report> deleteReport = new ArrayList<>();
     
        PreparedStatement stm = null;
        ResultSet rs = null;
        String count = null;
      
        
        try{
        String fromCreatedDate = fromDate;
        String toCreatedDate = toDate;
        
        //create sql to get the selected client
        String sql = "SELECT * FROM report WHERE deleteDate BETWEEN ? and ? ";
        
        //create prepared statement
        stm = conn.prepareStatement(sql);
        
        //set params
        stm.setString(1,fromCreatedDate);
        stm.setString(2,toCreatedDate);
        
        
        //execute statement
       rs=stm.executeQuery();
        
       while(rs.next())
       {
       
        //retrieve data from result set row
        int id = rs.getInt("reportId");
        String firstName = rs.getString("firstName");
        String lastName = rs.getString("lastName");
        String userName = rs.getString("userName");
        String creationDate = rs.getString("creationDate");
        String deleteDate = rs.getString("deleteDate");
        
        
        //create new client object
        Report delReportObj = new Report(id,firstName,lastName,userName,creationDate,deleteDate);
        
             
        //add it to the list of client
        deleteReport.add(delReportObj);
     
       }
      
        
       
        
        
        return deleteReport;
        
      
        
        }
        finally 
        {
        //clean up the JDBC objects
            close(conn,stm,null);
        
        
        } 
        
        
    }
    
    
    
    
}
