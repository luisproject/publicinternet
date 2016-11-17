package utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("all")
public class MessageBundle {
	
	private static final String USERNAME_PATTERN = "^[a-z0-9_-]{3,15}$";
	
	public static boolean isUsername(String username){
		return username.matches(USERNAME_PATTERN);
	}
}
