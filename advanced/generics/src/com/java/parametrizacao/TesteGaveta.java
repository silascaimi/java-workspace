package com.java.parametrizacao;

public class TesteGaveta {

	public static void main(String[] args) {

		Gaveta<String> gaveta = new Gaveta<>();
		
		gaveta.colocarItem("Livro de Java");
		
		System.out.println(gaveta.retirarPrimeiro());
		
		
	}

}
