package com.java.email;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {

	public static boolean isEmail(String email) {
		
		String regex = "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
		
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(email);
		
		boolean isValid = matcher.matches();
		
		
		// alternativa
		isValid = Pattern.compile(regex).matcher(email).matches();
		
		return isValid;
	}
}
