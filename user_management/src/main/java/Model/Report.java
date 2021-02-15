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
public class Report {
    
    int id;
    String firstName;
    String lastName;
    String userName;
    String creationDate;
    String deleteDate;

    public Report(String firstName, String lastName, String userName, String creationDate, String deleteDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.creationDate = creationDate;
        this.deleteDate = deleteDate;
    }

    public Report(int id, String firstName, String lastName, String userName, String creationDate, String deleteDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.creationDate = creationDate;
        this.deleteDate = deleteDate;
    }

   

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

  
    
    
    public Report(String deleteDate) {
        this.deleteDate = deleteDate;
    }

    public Report(int id, String creationDate, String deleteDate) {
        this.id = id;
        this.creationDate = creationDate;
        this.deleteDate = deleteDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getDeleteDate() {
        return deleteDate;
    }

    public void setDeleteDate(String deleteDate) {
        this.deleteDate = deleteDate;
    }
    
    
    
    
    
    
    
}
