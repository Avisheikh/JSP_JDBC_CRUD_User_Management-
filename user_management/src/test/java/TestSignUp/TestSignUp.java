/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSignUp;

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
public class TestSignUp {
    
   
    signUpData signUpData;
    
    public TestSignUp() {
    }
    
    
   @Test 
    public void checkPasswordLength(){
    
     signUpData = new signUpData();
     String password = "abishek212";
     boolean result = signUpData.isValidPasswordLength(password);
    
     if(result == true){
     
         assertTrue(result);
         
     }
     else{
         assertTrue(result);
     }
     
    }
    
       @Test 
    public void checkPassword(){
    
     signUpData = new signUpData();
    String password = "abishek212";
    String cPassword = "abishek212";
    
    boolean result = signUpData.isValidPassword(password, cPassword);
    
    if(result == true){
    
    assertTrue(result);
    }
    else{
    
    assertTrue(result);
    }
    
    }
     
       @Test 
    public void checkExistedUserName(){
    
    signUpData = new  signUpData();
    
    String username = "Metrics";
    boolean result = signUpData.isValidUserName(username);
    if(result == false){
    
        assertFalse(result);
    }
    else{
    
        assertFalse(result);
    }
    }
    
    
    @Test 
    
    public void checkUserNameLength(){
    
    signUpData = new  signUpData();
    String UserName = "absiehk" ;
    boolean result = signUpData.isValidUserNameLength(UserName);
    
    if(result == true){
    
    assertTrue(result);
    }
    else{
    
    assertTrue(result);
    }
    
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
