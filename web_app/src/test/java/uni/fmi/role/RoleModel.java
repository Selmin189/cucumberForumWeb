package uni.fmi.role;



import uni.fmi.models.*;
import uni.fmi.role.RoleService;

public class RoleModel {
	   private String username;
	   private String commentTitle;
	   private String message;
	   
	   public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }
	    
	    public String getCommentTitle() {
	        return commentTitle;
	    }

	    public void setCommentTitle(String commentTitle) {
	        this.commentTitle = commentTitle;
	    }
	    public String getMessage() {
	        return message;
	    }

	    public void setMessage(String message) {
	        this.message = message;
	    }
	    
	    public void clickDeleteButton() {
	        RoleService service = new RoleService();
	        User user = service.getUser(username);	       
	        
	        message = service.deleteComment(user);
	    }

}
