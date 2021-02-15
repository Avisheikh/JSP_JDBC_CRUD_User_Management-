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
public class TestForgotPassword {
    
    PasswordData passwordData;
    
    public TestForgotPassword() {
    }
    

    @Test
    public void checkDetailsForReset(){
    
    
    passwordData = new PasswordData(); 
    
    boolean result = passwordData.checkDetails("abishek","abishek@gmail.com","abishek212");
    
    if(result == false){
    
    assertFalse(result);
    }
    else{
    
    assertFalse(result);
    
    }
    
    }
    
    
    @Test
    public void validateNewPassword(){
    
  passwordData = new PasswordData(); 
    
    boolean result = passwordData.checkNewPasswordLength("abishek212");
    
    if(result == true){
    
    assertTrue(result);
    }
    else{
    
    assertTrue(result);
    }
    
    }
    
    
    @Test 
    public void validateConfirmPassword(){
    
    
    passwordData = new PasswordData();
    boolean result = passwordData.checkConfirmPassword("abishek", "abishek");
    
    if(result == true){
    
    assertTrue(result);
    }
    else{
    
    assertTrue(result);
    
    }
    
    }
    
    
    @Test
    public void validateUserName(){
    
   passwordData = new PasswordData();
    
    boolean result =passwordData.checkUsername("abishek");
    
    if(result == true){
    
    assertTrue(result);
    
    }
    else{
    
        assertTrue(result);
    
    }
    
    }
    
    @Test
    public void validateEmail(){
    
    passwordData= new PasswordData();
    
    boolean result = passwordData.checkEmail("abishek@gmail.com");
    
    if(result == false){
    
    assertFalse(result);
    }
    else{
    
    assertFalse(result);
    }
    
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
