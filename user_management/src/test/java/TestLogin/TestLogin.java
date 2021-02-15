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
public class TestLogin {

    
    TestLoginData loginData;    
    
    
    public TestLogin() {
    }

@Test
public void validDetails(){

loginData = new TestLoginData();
String username = "admin";
String password  =  "admin123";
boolean result = loginData.userEntersRightDetails(username,password);
if(result == true){


assertTrue(result);

}
else{

assertTrue(result);
}

}


@Test 
public void invalidUserName(){
loginData = new TestLoginData();
String UserName = "absihek";
boolean result = loginData.userEntersWrongUserName(UserName);
if(result == true){

assertTrue(result);

}
else{
assertTrue(result);
}
}


@Test 
public void invalidPassword(){


loginData = new TestLoginData();
String password = "abishek";
boolean result = loginData.userEntersWrongPassword(password);

if(result == true){

    assertTrue(result);

}
else{

assertTrue(result);

}
}

@Test
public void nullUserName(){

loginData = new TestLoginData();
String username = "";
boolean result = loginData.userEntersNullUsername(username);
if(result == true){

    assertTrue(result);

}
else{

assertTrue(result);

}
}

@Test

public void nullPassword(){

loginData = new TestLoginData();
String password = "";
boolean result = loginData.userEntersNullUsername(password);
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
