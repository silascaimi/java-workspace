package com.java;

import com.java.modelo.Funcionario;

public class Teste {

	public static void main(String[] args) {
		
		// Para gerar o javadoc v� para Project > Genarete Javadoc

		Funcionario funcionario = new Funcionario("Jo�o", 3000);
		
		System.out.println(funcionario.adiantamentoViagem(5, true));

	}

}
