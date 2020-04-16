package com.java.email;

public class Aplicacacao {

	public static void main(String[] args) {
		

		String email = "email@dominio.com";
		
		if (RegexUtils.isEmail(email)) {
			System.out.println("Email " + email + " é válido");
		} else {
			System.out.println("Email " + email + " não é válido");
		}

	}

}
