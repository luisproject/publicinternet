package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("all")
public class MessageBundle {
	
	private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";
	private static final String SERVICE_PATTERN = "^[~!@#$%^&*()_+{}:]";
	
	public static boolean isUsername(String username){
		return username.matches(USERNAME_PATTERN);
	}
	
	public static boolean isService(String service){
		return service.matches(SERVICE_PATTERN);
	}
}
