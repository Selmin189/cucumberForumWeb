package uni.fmi.role;

import java.util.ArrayList;
import java.util.List;



import uni.fmi.models.*;

public class RoleService {
	 public List<Role> roles = new ArrayList<>();
	 public List<User> users = new ArrayList<>();
	
	 
	 public RoleService() {
	        Role userRole = new Role("User");
	        Role adminRole = new Role("Admin");
	        roles.add(userRole);
	        roles.add(adminRole);
	        User user = new User("Селмин","saitise12@gmail.com");
	        User admin = new User("Енес","metic@gmail.com");
	        admin.addRole(adminRole);
	        users.add(user);
	        users.add(admin);	        
	     
	    
	        
	    }
	    public Role getRole(String roleCode) {
	        for (Role role : roles) {
	            if (role.getRoleCode().equals(roleCode)) return role;
	        }
	        return null;
	    }

	    public User getUser(String username) {
	        for (User user : users) {
	            if (user.getUsername().equals(username))return user;
	        }
	        return null;
	    }
	    
	    public String deleteComment(User user) {
	       
	        if (user == null || !users.contains(user)) return "потребител не съществува!";
	        if (users.contains(user) && user.getRoles().contains(getRole("Admin"))) return "Коментарът е изтрит успешно!";
	        if (users.contains(user) && user.getRoles().contains(getRole("User"))) return "коментар може да бъде изтрит само от администратор!";
	        return null;
	        
	    }
	  

}
