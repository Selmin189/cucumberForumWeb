package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Topic {

    private String title; 
    private String type;
    private String description;
    private User owner;
    private Set<Comment> comments;
    
    public Topic() {
    }


    public String getTitle() {
        // TODO implement here
        return title;
    }

  
    public void setTitle(String title) {
        this.title=title;

    }

    public String getType() {
        // TODO implement here
        return type;
    }

 
    public void setType(String type) {
        this.type=type;
   
    }

 
    public String getDescription() {
        // TODO implement here
        return description;
    }

 
    public void setDescription(String description) {
        this.description=description;
    
    }

    public User getOwner() {
        // TODO implement here
        return owner;
    }

  
    public void setOwner(User owner) {
        this.owner=owner;

    }

    public Set<Comment> getComments() {
        // TODO implement here
        return comments;
    }


    public void setComments(Set<Comment> comments) {
        this.comments=comments;
 
    }

}