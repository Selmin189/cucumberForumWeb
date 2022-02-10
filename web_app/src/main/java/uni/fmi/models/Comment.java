package uni.fmi.models;
import java.util.*;


import uni.fmi.models.*;

/**
 * 
 */
public class Comment {

    /**
     * Default constructor
     */
    public Comment() {
    }
    
    public Comment(String title, User user) {
       
        this.title= title;
        this.user = user;
       
    }
    
//    public Comment(final String content ,String user) {
//    	this.content=content;
//    	this.user=user;
//    }
//    
    private String content;
    private String title;
    private Date date;
    private Topic topic;
    private User user;
    private Set<Comment> comments= new HashSet<>();
   


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        // TODO implement here
        return content;
    }

    public void setContent(String content) {
       this.content=content;

    }

    /**
     * @return
     */
    public Date getDate() {
        // TODO implement here
        return date;
    }

    /**
     * @param data Data 
     * @return
     */
    public void setDate(Date date) {
        this.date=date;
       
    }

    /**
     * @return
     */
    public Topic getTopic() {
        // TODO implement here
        return topic;
    }

    /**
     * @param topic 
     * @return
     */
    public void setTopic(Topic topic) {
        this.topic=topic;
     
    }
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Comment> getComments() {
        return comments;
    }


}