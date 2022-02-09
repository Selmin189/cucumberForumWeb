package uni.fmi.comm.model;

import uni.fmi.comm.model.CommService;

public class CommScreenModel {

	private String content;
	private String user;
	private String message;

	public void setContent(final String content) {
		this.content=content;
	}
	
	public void setUser(final String user) {
		this.user=user;
	}
	
	public String getMessage() {
		return message;
	}

	public void clickAddButton() {
		message = CommService.comm(content,user);
		
	}
	
}
