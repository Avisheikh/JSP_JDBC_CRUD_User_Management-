
package DOA;



import JDBC_Connection.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Model.Admin;
import Model.History;
import Model.adminHistory;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author abishek
 */
public class HistoryDOA {
    
    
     private Connection conn;
    
    public HistoryDOA()
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

    public void addHistory(History historyObj)throws Exception {
   
      PreparedStatement  stm = null;
      
      try{
      //create sql query and get connection to insert the query
      String sql = "insert into history"
                        +"(clientUserName,creationTime,lastAccess)"
                        +"values(?,?,?)";
        
      stm = conn.prepareStatement(sql);
      
      //set the param values from history
      stm.setString(1, historyObj.getClientUserName());
      stm.setString(2, historyObj.getLoginTime());
      stm.setString(3, historyObj.getLastLoginTime());
      
      
      //excute query
      stm.execute();}
      
      finally{
      
       //clean up JDBC objects
         close(conn,stm,null);
         
      
      }
      
      
        
        
        
        
        
    }

    public void adminHistory(adminHistory historyObj) throws Exception {
      PreparedStatement  stm = null;
      
      try{
      //create sql query and get connection to insert the query
      String sql = "insert into admin_history"
                        +"(adminUserName,creationTime,lastAccess)"
                        +"values(?,?,?)";
        
      stm = conn.prepareStatement(sql);
      
      //set the param values from history
      stm.setString(1, historyObj.getAdminUserName());
      stm.setString(2, historyObj.getLoginTime());
      stm.setString(3, historyObj.getLastLoginTime());
      
      
      //excute query
      stm.execute();}
      
      finally{
      
       //clean up JDBC objects
         close(conn,stm,null);
         
      
      }
      
      
        
    }

    public List<History> getClientHistory(String userName) throws Exception {
       List<History> users = new ArrayList<>();
    
    
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    try{
    //get a connection
    String userNameClient = userName;
    
    
    //create sql statement
    String sql = "select * from history where clientUserName=?";
    
    stm = conn.prepareStatement(sql);
    //set params
    
    stm.setString(1,userNameClient);
    
    //execute query
    rs = stm.executeQuery();
    
    
    //process result set
    while(rs.next())
    {
    

        //retrieve data from result set row
        
        int id = Integer.parseInt(rs.getString("historyId"));
        String clientUserName = rs.getString("clientUserName");
        String creationTime = rs.getString("creationTime");
        String lastAccess = rs.getString("lastAccess");
        
        
        //ccreate new user object
        History tempUser = new History(id,clientUserName,creationTime,lastAccess);
        
        //add it to the list of student
        
        users.add(tempUser);
    
    }

    
    return users;
    }
    
    finally{

    //close JDBC objects
    
    close(conn,stm,rs);
    
    }
    
    
        
    }

    public List<adminHistory> getAdminHistory() throws Exception {
       
        
        List<adminHistory> users = new ArrayList<>();
    
    
    Statement stm = null;
    ResultSet rs = null;
    
    try{
    //get a connection
    
    
    //create sql statement
    String sql = "select * from admin_history";
    stm = conn.createStatement();
    
    //execute query
    rs = stm.executeQuery(sql);
    
    
    //process result set
    while(rs.next())
    {
    

        //retrieve data from result set row
        
        int id = Integer.parseInt(rs.getString("historyId"));
        String adminUserName = rs.getString("adminUserName");
        String creationTime = rs.getString("creationTime");
        String lastAccess = rs.getString("lastAccess");
        
        
        //ccreate new user object
        adminHistory tempUser = new adminHistory(id,adminUserName,creationTime,lastAccess);
        
        //add it to the list of student
        
        users.add(tempUser);
    
    }

    
    return users;
    }
    
    finally{

    //close JDBC objects
    
    close(conn,stm,rs);
    
    }
    
    
        
        
        
        
    }

    public List<History> getClientHistoryList() throws Exception {
         List<History> users = new ArrayList<>();
    
    
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    try{


    
    
    //create sql statement
    String sql = "select * from history";
    
    stm = conn.prepareStatement(sql);
    //set params
    

    
    //execute query
    rs = stm.executeQuery();
    
    
    //process result set
    while(rs.next())
    {
    

        //retrieve data from result set row
        
        int id = Integer.parseInt(rs.getString("historyId"));
        String clientUserName = rs.getString("clientUserName");
        String creationTime = rs.getString("creationTime");
        String lastAccess = rs.getString("lastAccess");
        
        
        //ccreate new user object
        History tempUser = new History(id,clientUserName,creationTime,lastAccess);
        
        //add it to the list of student
        
        users.add(tempUser);
    
    }

    
    return users;
    }
    
    finally{

    //close JDBC objects
    
    close(conn,stm,rs);
    
    }
    
    }

    public List<adminHistory> getSpecificAdminHistory(String userName) throws Exception {
       
        
        List<adminHistory> users = new ArrayList<>();
    
    
    PreparedStatement stm = null;
    ResultSet rs = null;
    
    try{
    //get a connection
    String userNameAdmin = userName;
    
    
    //create sql statement
    String sql = "select * from admin_history where adminUserName=?";
    
    stm = conn.prepareStatement(sql);
    //set params
    
    stm.setString(1,userNameAdmin);
    
    //execute query
    rs = stm.executeQuery();
    
    
    //process result set
    while(rs.next())
    {
    

        //retrieve data from result set row
        
        int id = Integer.parseInt(rs.getString("historyId"));
        String adminUserName = rs.getString("adminUserName");
        String creationTime = rs.getString("creationTime");
        String lastAccess = rs.getString("lastAccess");
        
        
        //ccreate new user object
        adminHistory tempUser = new adminHistory(id,adminUserName,creationTime,lastAccess);
        
        //add it to the list of student
        
        users.add(tempUser);
    
    }

    
    return users;
    }
    
    finally{

    //close JDBC objects
    
    close(conn,stm,rs);
    
    }
    
    
        
        
        
        
        
        
        
        
        
        
        
        
    }





    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
