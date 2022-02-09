package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Comment {

    /**
     * Default constructor
     */
    public Comment() {
    }
    public Comment(final String content ,String user) {
    	this.content=content;
    	this.user=user;
    }
    
    private String content;
    private Date date;
    private Topic topic;
    private String user;
   


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
    public String getUser() {
        // TODO implement here
        return user;
    }

    /**
     * @param topic 
     * @return
     */
    public void setUser(String user) {
        this.user=user;
     
    }

}