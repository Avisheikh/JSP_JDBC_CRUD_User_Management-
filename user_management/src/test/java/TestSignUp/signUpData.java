/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSignUp;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author abish
 */
public class signUpData {
    
     
    
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
    String existedUserName = "abishek";
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
