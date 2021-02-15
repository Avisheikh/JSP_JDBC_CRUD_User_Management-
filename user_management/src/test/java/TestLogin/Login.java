/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestLogin;

/**
 *
 * @author abish
 */
public class Login {
    
      private String UserName;
    private String Password;

    
    public Login(){}
    
    public Login(String UserName, String Password) {
        this.UserName = UserName;
        this.Password = Password;
    }

    

    public String getUserName() {
        return UserName;
    }

    public String getPassword() {
        return Password;
    }


    public static Login getLoginObj(){
    
    
    return new Login("admin","admin123");
    
    }
    
}
