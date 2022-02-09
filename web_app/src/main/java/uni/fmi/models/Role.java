package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Role {

	private String roleTitle;
    private String roleCode;
    private String roleDescription;
    private Set<User> users;
    
    public Role(final String roleTitle) {
    	this.roleTitle=roleTitle;
    }
    
    public String getRoleTitle() {
        // TODO implement here
        return roleTitle;
    }

  
    public void setRoleTitle(String roleTitle) {
      this.roleTitle=roleTitle;
  
    }
    
    public String getRoleDescription() {
        // TODO implement here
        return roleDescription;
    }

  
    public void setRoleDescription(String roleDescription) {
      this.roleDescription=roleDescription;
  
    }
    

    public String getRoleCode() {
        // TODO implement here
        return roleCode;
    }

  
    public void setRoleCode(String roleCode) {
      this.roleCode=roleCode;
  
    }

   
    public Set<User> getUsers() {
        // TODO implement here
        return users;
    }

   
    public void setUsers(Set<User> users) {
        this.users=users;
     
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roleCode == null) ? 0 : roleCode.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Role other = (Role) obj;
		if (roleCode == null) {
			if (other.roleCode != null) {
				return false;
			}
		} else if (!roleCode.equals(other.roleCode)) {
			return false;
		}
		return true;
	}


}