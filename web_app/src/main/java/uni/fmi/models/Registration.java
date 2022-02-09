package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Registration {

	  	private String firstname; 
	    private String lastname;
	    private String password;   
	    private String email;
	    private Date dob;
	    private User user;
	    
	    
    public Registration() {
    }

    public String getFirstname() {
        // TODO implement here
        return firstname;
    }


    public void setFirstname(String firstname) {
       this.firstname=firstname;
   
    }

    public String getLastname() {
        // TODO implement here
        return lastname;
    }


    public void setLastname(String lastname) {
        this.lastname=lastname;
      
    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return password;
    }

    public void setPassword(String password) {
       this.password=password;
      
    }

    /**
     * @return
     */
    public String getEmail() {
        // TODO implement here
        return email;
    }


    public void setEmail(String email) {
        this.email=email;
      
    }

    /**
     * @return
     */
    public Date getDob() {
        // TODO implement here
        return dob;
    }


    public void setDob(Date dob) {
       this.dob=dob;
      
    }

    /**
     * @return
     */
    public User getUser() {
        // TODO implement here
        return user;
    }

    /**
     * @param user 
     * @return
     */
    public void setUser(User user) {
        this.user=user;
       
    }

}