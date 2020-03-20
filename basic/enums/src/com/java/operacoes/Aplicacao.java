package com.java.operacoes;

public class Aplicacao {

	public static void main(String[] args) {

		Operacoes o1 = Operacoes.ADICAO;
		System.out.println(o1.operacao(5, 2));
		
		for(Object a : Operacoes.values()) {
			if (a instanceof Operacoes) {
				System.out.println(((Operacoes) a).operacao(4, 2));
			}
			if (a instanceof String) {
				System.out.println(a);
			}
		}
		
	}
}