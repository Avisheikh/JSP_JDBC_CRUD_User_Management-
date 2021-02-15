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

import Model.Client;
import JDBC_Connection.ConnectionProvider;
import Model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDOA {
    
    
    private Connection conn;
    
    public LoginDOA()
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

    public boolean validate(Client theClient) throws SQLException {
          PreparedStatement stm = null;
          ResultSet rs = null;
          boolean status = false;
          
        try{
      
        
        //create sql query and get connection 
        String sql = "Select * from client_user where userName = ? and password = ?";
        stm = conn.prepareStatement(sql);
        
        ////set the param values for the user
        stm.setString(1, theClient.getUserName());
        stm.setString(2, theClient.getPassword());
        
        //execute sql
      rs=stm.executeQuery();
			
	status = rs.next();
        
        
        return status;
        
        }
        
        finally
        {
        close(conn,stm,rs);
        
        }
        
        
    }

    public Client getUser(String theClientName) throws Exception {
       
        Client theClient = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        
        String clientUserName;
        
        try{
        clientUserName = theClientName;
        
        //create sql to get the selected client
        String sql = "Select * from client_user where userName=?";
        
        //create prepared statement
        stm = conn.prepareStatement(sql);
        
        //set params
        stm.setString(1,clientUserName);
        
        //execute statement
        rs=stm.executeQuery();
        
        //retriebe data from result set row
        
        
        
        if(rs.next())
        {
        int id = rs.getInt("id");
        String firstName = rs.getString("firstName");
        String lastName = rs.getString("lastName");
        String address = rs.getString("address");
        String email = rs.getString("email");
        String userName = rs.getString("userName");
        String dob = rs.getString("dob");
        String password = rs.getString("password");
        String rePassword = rs.getString("rePassword");
        
        //user the clientId during construction
        
        theClient = new Client(id, firstName, lastName, address,userName, email, dob, password, rePassword);

        }else 
        {
        throw new Exception("Could not find client id:" + clientUserName);
        }
        
        
        
        
        return theClient;
        
        
        }
        finally 
        {
        //clean up the JDBC objects
            close(conn,stm,rs);
        
        
        }
        
        
        
        
    }

    public boolean validateAdmin(Admin theAdmin) throws Exception {
        PreparedStatement stm = null;
          ResultSet rs = null;
          boolean status = false;
          
        try{
      
        
        //create sql query and get connection 
        String sql = "Select * from user where userName = ? and password = ?";
        stm = conn.prepareStatement(sql);
        
        ////set the param values for the user
        stm.setString(1, theAdmin.getUserName());
        stm.setString(2, theAdmin.getPassword());
        
        //execute sql
      rs=stm.executeQuery();
			
	status = rs.next();
        
        
        return status;
        
        }
        
        finally
        {
        close(conn,stm,rs);
        
        }
        
    }

    public boolean validateClient(Client forgetPasswordObj) throws Exception {
      
     PreparedStatement stm = null;
     ResultSet rs = null;
     boolean status = false;
     
     try
     {
      //create sql query and get connection 
         String sql = "select * from client_user where firstName = ? and userName = ? and email = ? and dob = ?";
         
         stm = conn.prepareStatement(sql);
         
         
         //set param values for the client
         stm.setString(1, forgetPasswordObj.getFirstName());
         stm.setString(2, forgetPasswordObj.getUserName());
         stm.setString(3, forgetPasswordObj.getEmail());
         stm.setString(4, forgetPasswordObj.getDate_of_birth());
         
         //excute sql
         rs = stm.executeQuery();
         status = rs.next();
         
         return status;
         
     }
     finally
     {
     close(conn,stm,rs);
     }
     
     
     
     
     
     
     
     }

    public void resetClientPassword(Client resetPasswordObj) throws Exception {
      
    PreparedStatement stm = null;
        
        try
        {
        
        //create sql queries and connect it
            String sql = "update client_user set password=?, rePassword=? where userName=? ";
            stm = conn.prepareStatement(sql);
            
            
            //set param from Client into database
        stm.setString(1, resetPasswordObj.getPassword());
        stm.setString(2, resetPasswordObj.getRePassword());
        stm.setString(3,resetPasswordObj.getUserName());
        
        
        
         //excute sql
         stm.execute();
        
        }
      finally
            {
            
            //clean up JDBC objects
                close(conn,stm,null);
            }
        
        
        
        
        
        
    }
        
        
        
        
        
        
    }

        
    
