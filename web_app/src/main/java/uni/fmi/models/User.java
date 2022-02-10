package uni.fmi.models;
import java.util.*;



import uni.fmi.models.*;


/**
 * 
 */
public class User {
	   public User(String username,  String email) {
	        this.username = username;
	        this.email = email;
	        this.roles.add(new Role("User"));
	        }
	
		private String username;
	    private String password;
	    private String email;
	    private Set<Role> roles = new HashSet<>();
	    private Set<Comment> comments = new HashSet<>();
	    private Set<Topic> topics;
	    private Set<Registration> registration;
	    
    
    public User() {
    }


 


	public String getUsername() {
        // TODO implement here
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        this.username=username;
      
    }

    /**
     * @return
     */
    public String getPassword() {
        // TODO implement here
        return password;
    }

    /**
     * @param pass 
     * @return
     */
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

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
        this.email=email;
      
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }

    /**
     * @return
     */
    public Set<Topic> getTopics() {
        // TODO implement here
        return topics;
    }


    public void setTopics(Set<Topic> topics) {
       this.topics=topics;
  
    }
    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Comment> getComments() {
        return comments;
    }
    public void createComment(Comment comment) {
        this.comments.add(comment);
    }

    public Set<Registration> Registration() {
        // TODO implement here
        return registration;
    }


    public void setRegistration(Set<Registration> registration) {
       this.registration=registration;
    }

}