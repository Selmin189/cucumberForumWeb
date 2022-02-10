package uni.fmi.topic.model;

import uni.fmi.topic.TopicService;

public class TopicScreenModel {

	private String content;
	private String user;
	private String message;

	public void setContent(final String title) {
		this.content=title;
	}
	
	public void setUser(final String user) {
		this.user=user;
	}
	
	public String getMessage() {
		return message;
	}

	public void clickAddButton() {
		message = TopicService.comm(content,user);
		
	}
	
}
