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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Admin;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.text.SimpleDateFormat;
import javax.servlet.http.HttpSession;

public class ClientDbUtil {
    
    private Connection conn;
    
    public ClientDbUtil()
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
        
        
        public void addClient(Client theClient) throws Exception
        {
        
            PreparedStatement stm = null;
    
            
            
            try
            {
            
                //Get connection and create sql for insert
                
                String sql = "insert into client_user"
                        +"(firstName,lastName,email,address,userName,dob,password,rePassword)"
                        +"values(?,?,?,?,?,?,?,?)";
                
               stm = conn.prepareStatement(sql);

                //set the param values from client
                stm.setString(1,theClient.getFirstName());
                stm.setString(2, theClient.getLastName());
                stm.setString(3, theClient.getEmail());
                stm.setString(4, theClient.getAddress());
                stm.setString(5,theClient.getUserName());
                stm.setString(6, theClient.getDate_of_birth());
                stm.setString(7,theClient.getPassword());
                stm.setString(8, theClient.getRePassword());

                
                //execute sql insert
            stm.execute();
            
            
            
            
            }
            catch(SQLIntegrityConstraintViolationException e)
            {
              System.out.println(e.getMessage());
              throw new SQLIntegrityConstraintViolationException("User Name Already exists");
            }
            
            
            finally
            {
            
            //clean up JDBC objects
                close(conn,stm,null);
            }
        
        
        }

     public List<Client> getClient() throws Exception {
        
        List<Client> clients = new ArrayList<>();
        
        Statement stm = null;
        ResultSet rs = null;
        
        
        try{
        //create sql statement and get connection
        
        String sql = "select * from client_user";
        stm = conn.createStatement();
        
        //excute query
        rs = stm.executeQuery(sql);
        
        //process result set
        while(rs.next())
        {
            //retrieve data from result set row
        int id = rs.getInt("id");
        String firstName = rs.getString("firstName");
        String lastName = rs.getString("lastName");
        String address = rs.getString("address");
        String userName = rs.getString("userName");
        String email = rs.getString("email");
        String dob = rs.getString("dob");
        String password = rs.getString("password");
        String rePassword = rs.getString("rePassword");
        
        //create new client object
        Client tempClient = new Client(id,firstName,lastName,address,userName,email,dob,password,rePassword);
        
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
        rs = stm.executeQuery();
        
        //retriebe data from result set row
        
        if(rs.next())
        {
        int id = rs.getInt("id");
        String firstName = rs.getString("firstName");
        String lastName = rs.getString("lastName");
        String address = rs.getString("address");
        String email = rs.getString("email");
        String dob = rs.getString("dob");
        String password = rs.getString("password");
        String rePassword = rs.getString("rePassword");
        
        //user the clientId during construction
        
        theClient = new Client(id, firstName, lastName, address,clientUserName , email, dob, password, rePassword);

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

    public void updateClient(Client theClient) throws Exception { 
       
          PreparedStatement stm = null;
    
            
            
            try
            {
            
                //Get connection and create sql for insert
                
                String sql = "update client_user set firstName=?, lastName=?, email=?, userName=?, address=?, dob=?, password=?, rePassword=? where id=?";
                       
                
               stm = conn.prepareStatement(sql);

                //set the param values from client
                stm.setString(1,theClient.getFirstName());
                stm.setString(2, theClient.getLastName());
                stm.setString(3, theClient.getEmail());
                stm.setString(4, theClient.getUserName());
                stm.setString(5,theClient.getAddress());
                stm.setString(6, theClient.getDate_of_birth());
                stm.setString(7,theClient.getPassword());
                stm.setString(8, theClient.getRePassword());
                stm.setInt(9, theClient.getId());

                
                //execute sql insert
            stm.execute();
            
            
            
            
            }
            catch(SQLIntegrityConstraintViolationException e)
            {
              System.out.println(e.getMessage());
              throw new SQLIntegrityConstraintViolationException("User Name Already exists");
            }
            
            
            finally
            {
            
            //clean up JDBC objects
                close(conn,stm,null);
            }
        
        
        
        
        
        
    }

    public void delUser(String theUserId) throws Exception {
         PreparedStatement stm = null;
        
        try
        {
        
      // convert user id to int
		int userId = Integer.parseInt(theUserId);
			
			
			
			// create sql to delete student
		String sql = "delete from client_user where id=?";
			
			// prepare statement
		stm = conn.prepareStatement(sql);
			
			// set params
                stm.setInt(1, userId);
			
			// execute sql statement
		stm.execute();
        
        
        
        
        }
        finally
        {
        close(conn,stm,null);
        
        }
    }


    
    
    
    
    
}
