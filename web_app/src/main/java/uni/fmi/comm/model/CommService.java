package uni.fmi.comm.model;

import java.util.Collections;
import java.util.List;

import uni.fmi.models.Comment;

public class CommService {
	
	private static List<Comment> commDb = Collections.singletonList(new Comment("Wow","User"));
	
	public static String comm(String content, String user) {
		if(null == content) {
			return "коментар без съдържание не е позволен!";
		}
		final boolean isUserisRegAndCommIsNotNull = commDb.stream()
				.anyMatch(u -> u.getContent().equals(content) && u.getUser().equals(user));
				
				return isUserisRegAndCommIsNotNull ? "Успешно публикувахте коментар!" : "Не можете да публикувате коментар!";
	}

}
