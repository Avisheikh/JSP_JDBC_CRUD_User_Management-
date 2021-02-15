
package Model;

/**
 *
 * @author abishek
 */
public class Admin {
    
    protected int id;
    protected String firstName;
    protected String lastName;
    protected String address;
    protected String userName;
    protected String email;
    protected String date_of_birth;
    protected String password;
    protected String rePassword;

    public Admin(String userName,String password)
    {
    this.userName = userName;
    this.password = password;
    
    
    }
    
    
    public Admin(int id, String firstName, String lastName, String address, String userName, String email, String date_of_birth, String password, String rePassword) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.userName = userName;
        this.email = email;
        this.date_of_birth = date_of_birth;
        this.password = password;
        this.rePassword = rePassword;
    }

    public Admin(String firstName, String lastName, String address, String userName, String email, String date_of_birth , String password, String rePassword) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
          this.userName = userName;
        this.email = email;
        this.date_of_birth = date_of_birth;
           this.password = password;
        this.rePassword = rePassword;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRePassword() {
        return rePassword;
    }

    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", email=" + email + ", date_of_birth=" + date_of_birth + '}';
    }
    
    
    
}
