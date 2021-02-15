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
public class TestAddUser {
    
   UserData userData;
    
    
 @Test 
    public void checkPasswordLength(){
    
     userData = new UserData();
     String password = "abishek212";
     boolean result =userData.isValidPasswordLength(password);
    
     if(result == true){
     
         assertTrue(result);
         
     }
     else{
         assertTrue(result);
     }
     
    }
    
    @Test 
    public void checkPassword(){
    
   userData = new UserData();
    String password = "abishek212";
    String cPassword = "abishek212";
    
    boolean result = userData.isValidPassword(password, cPassword);
    
    if(result == true){
    
    assertTrue(result);
    }
    else{
    
    assertTrue(result);
    }
    
    }
    
   
    
   @Test 
    public void checkExistedUserName(){
    
   userData = new UserData();
    
    String username = "abishek";
    boolean result = userData.isValidUserName(username);
    if(result == false){
    
        assertFalse(result);
    }
    else{
    
        assertFalse(result);
    }
    }
    
    
    @Test 
    public void checkUserNameLength(){
    
    userData = new UserData();
    String UserName = "abishek" ;
    boolean result =userData.isValidUserNameLength(UserName);
    
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
