/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validate_Client;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author abish
 */
public class PasswordData {
    
    Client client;
    
    public boolean checkDetails(String username,String email, String password){
    
        
    client = Client.getClient();
    boolean result = false;
    
    
    if(client.getUserName().equals(username) && client.getEmail().equals(email) && 
            client.getPassword().equals(password)){
    
        result = false;
    
    }
    
    
    
    
    return result;
    }
    
    
    public boolean checkNewPasswordLength(String Newpassword){
    
    boolean result = false;
    
    
    
    if(Newpassword.length() == 10){
    
    result = true;
    
    
    }
    
    
    
    return result;
    
    }
    
    
    
    public boolean checkConfirmPassword(String Newpassword,String confirmNewPassword){
    
        
    boolean result = false;
    

    if(Newpassword.equals(confirmNewPassword)){
    
        result = true;
    }
        
    
    return result;
    }
    
    
    public boolean checkUsername(String username){
    
    
    boolean result  = false;
    Client cl = Client.getClient();
    
    if(cl.getUserName().equals(username)){
    
    
    result = true;
    
    
    
    }
    
    
    
    
    
    return result;
    
    }
    
    
    
    public boolean checkEmail(String email){
    
    
    boolean result = false;
    
    Client cl = Client.getClient();
    
    if(cl.getEmail().equals(email)){
    
    
    
    
    result = true;
    
    
    }
    
    return result;
    }
    
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
