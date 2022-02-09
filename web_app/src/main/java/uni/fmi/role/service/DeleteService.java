package uni.fmi.role.service;

import java.util.Collections;
import java.util.List;

import uni.fmi.models.Role;

public class DeleteService {
	
	private static List<Role> roleDb = Collections.singletonList(new Role("Admin"));
	
	

	public static String delete(String roleTitle) {

		final boolean isUserisAdmin = roleDb.stream()
				.anyMatch(u -> u.getRoleTitle().equals(roleTitle));
		
		return  isUserisAdmin ? "Успешно изтриване!" : "Вие не сте админ не можете да триете!";
	}

	

}
