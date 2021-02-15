/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author abishek
 */
public class adminHistory {
    
        int historyId;
        String adminUserName;
        String loginTime;
        String lastLoginTime;

    public adminHistory(int historyId, String adminUserName, String loginTime, String lastLoginTime) {
        this.historyId = historyId;
        this.adminUserName = adminUserName;
        this.loginTime = loginTime;
        this.lastLoginTime = lastLoginTime;
    }

    public adminHistory(String adminUserName, String loginTime, String lastLoginTime) {
        this.adminUserName = adminUserName;
        this.loginTime = loginTime;
        this.lastLoginTime = lastLoginTime;
    }

    public String getAdminUserName() {
        return adminUserName;
    }

    public void setAdminUserName(String adminUserName) {
        this.adminUserName = adminUserName;
    }

    
    
    
    
    
    
    
    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }



    public String getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    public String getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
        
        
        
    
    
        
        
        
        
        
        
}
