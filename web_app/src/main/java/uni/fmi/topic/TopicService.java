package uni.fmi.topic;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import uni.fmi.models.Comment;
import uni.fmi.models.Topic;

public class TopicService {
	
	
	private static List<Topic> commDb = Arrays.asList(new Topic("Wow","User"),new Topic("S","User"));
	

	
	public static String comm(String title, String user) {
		
		if(null == title) {
			return "тема без заглавие не е позволенa!";
		}
		
		if(title.length()<2) {
			return "коментар с една буква не е позволен!";
		}
		
		
		final boolean isUserisRegAndCommIsNotNull = commDb.stream()
				.anyMatch(u -> u.getTitle().equals(title) && u.getUser().equals(user));
				
				return isUserisRegAndCommIsNotNull ? "Успешно публикувахте тема!" : "Не можете да публикувате тема!";
	}

}
