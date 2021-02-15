/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestAddUser;

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
public class UserData {
    
     public boolean isValidPasswordLength(String password){
    
    boolean result = false; 
    
    if(password.length() == 10){
    
        result = true;
    
    }
    
    return result;
    
    }
    
    public boolean isValidPassword(String password, String confirmPassword){
    
    boolean result = false;
    
    if(password.equals(confirmPassword)){
    
    result  = true;
    }
    
    
    return result;
    }
    
 
    
    public boolean isValidUserName(String UserName){
    
    boolean result = true; 
    String existedUserName = "abisehk";
    if(!UserName.equals(existedUserName)){
    
        result = false;
    }
    
    
    return result;
    }
    
    public boolean isValidUserNameLength(String UserName){
    
    boolean result = false;
    
    if(UserName.length() >= 5){
    
    result = true;
    
    }
    
    
    
    return result;
    }
    
}
