/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLogin;

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
public class TestLoginData {
    
       Login log ;
    
    public boolean userEntersRightDetails(String username,String password){
    
    boolean result = false;
    log = Login.getLoginObj();
    
            
    if( log.getUserName().equals(username) && log.getPassword().equals(password)){
    
    result = true;
    
    }
   
    return result;
    }
    
    

    
    public boolean userEntersWrongUserName(String UserName){
    
    boolean result = false;
    log = Login.getLoginObj();
    
    if(!log.getUserName().equals(UserName)){
    
    result = true;
        
    }
    
    return result;
    }
    
    public boolean userEntersWrongPassword(String Password){
    
    boolean result = false;
    log = Login.getLoginObj();
    if(!log.getPassword().equals(Password)){
    
    
    result = true;
    }
    
    
    return result;
    }
    
    public boolean userEntersNullUsername(String UserName){
    
    log = Login.getLoginObj();
    
    boolean result = false ;
    
    if(!log.getUserName().equals(UserName)){
    
    result = true;
    
    
    }
    
    return result;
    }
    
        public boolean userEntersNullPassword(String Password){
    
    log = Login.getLoginObj();
    
    boolean result = false;
    
    if(!log.getPassword().equals(Password)){
    
    result = true;
    
    
    }
    
    return result;
    }
    
}
