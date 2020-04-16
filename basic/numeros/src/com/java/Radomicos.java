package com.java;
import java.util.Random;

public class Radomicos {

	public static void main(String[] args) {
		
		Random r = new Random();
		System.out.println(r.nextDouble()); // Randomico entre 0 e 1
		
		System.out.println(r.nextInt(10)); // Randomico entre 0 e 9
		
		// Usando a classe Math
		double rand = Math.random(); // Obtem um numero entre 0 e 1
		System.out.println(rand);
		
		System.out.println(gerarInt(1,7));
	}
	
	// Randomicos em intervalo
	static int gerarInt(int inicio, int fim) {
		int intervalo = fim - inicio;
		int n = (int) (Math.random() * intervalo) + inicio;
		return n;
	}
}
