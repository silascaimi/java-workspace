package com.java.parametrizacao;

import java.util.ArrayList;
import java.util.List;

public class TesteRetiraElementos {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(new Funcionario("Jo�o"));
		
		Funcionario f = RetiraElementos.recuperaPrimeiro(funcionarios);
		
		System.out.println(f.getNome());
		
	}
}
