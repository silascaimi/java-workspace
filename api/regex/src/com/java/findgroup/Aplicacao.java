package com.java.findgroup;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {

	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("([a-z])+");
		Matcher matcher = pattern.matcher("a1bc2def3");
		
		while (matcher.find()) {
			int pos = matcher.start();
			
			System.out.println(pos + " " + matcher.group());
		}
		
		/* Output
		 * 
		 * 0 a
		 * 2 bc
		 * 5 def
		 */
	}

}
