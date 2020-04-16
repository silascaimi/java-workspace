package com.java.replace;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aplicacao {

	public static void main(String[] args) {

		// Substitui as letras por '?'
		
		Pattern pattern = Pattern.compile("([a-z])+");
		Matcher matcher = pattern.matcher("a1bc2def3");
		
		StringBuffer sb = new StringBuffer();
		
		while (matcher.find()) {
			int pos = matcher.start();
			String group = matcher.group();
			
			group = "?";
			matcher.appendReplacement(sb, group);
			
			System.out.println(pos + " " + group);
		}
		
		matcher.appendTail(sb);  
		
		System.out.println(sb);

	}

}
