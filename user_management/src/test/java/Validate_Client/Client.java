/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate_Client;

/**
 *
 * @author abish
 */
public class Client {
    
    
    private String userName;
    private String password;
    private String email;

    public Client(String userName, String password, String email) {
        this.userName = userName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
 
    
    
    public static Client getClient(){
   
    return new Client("abishek","abishek@gmail.com","abishek212");
    }
    
    
    
    
    
    
    
    
    
    
    
}
