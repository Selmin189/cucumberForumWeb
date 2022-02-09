package uni.fmi.role.model;


import uni.fmi.role.service.DeleteService;

public class DeleteScreenModel {
	
	private String roleTitle;
	private String message;
	
	public void setRoleTitle(final String roleTitle) {
		this.roleTitle=roleTitle;
	}

	public void clickDeleteButton() {
		message = DeleteService.delete(roleTitle);

	}
	
	public String getMessage() {
		return message;
	}

}
