/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author abish
 */
public class History {
    
        int historyId;
        String clientUserName;
        String loginTime;
        String lastLoginTime;

    public History(int historyId, String clientUserName, String loginTime, String lastLoginTime) {
        this.historyId = historyId;
        this.clientUserName = clientUserName;
        this.loginTime = loginTime;
        this.lastLoginTime = lastLoginTime;
    }

    public History(String clientUserName, String loginTime, String lastLoginTime) {
        this.clientUserName = clientUserName;
        this.loginTime = loginTime;
        this.lastLoginTime = lastLoginTime;
    }

    
    
    
    
    
    
    
    public int getHistoryId() {
        return historyId;
    }

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public String getClientUserName() {
        return clientUserName;
    }

    public void setClientUserName(String clientUserName) {
        this.clientUserName = clientUserName;
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
