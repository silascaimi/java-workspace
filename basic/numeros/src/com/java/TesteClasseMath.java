package com.java;

import static java.lang.Math.PI; //importe st�tico que permite usar a vari�vel PI diretamente

public class TesteClasseMath {

	public static void main(String[] args) {
		
		double array[] = {};
		
		try{
			System.out.println("Maior elemento do array = " + calcularMaior(array));
		} catch(Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
		
	}
	
	//Calcular circunferencia usando Math.PI
	public static double calcularCircunerencia(double raio) {
		
		return 2 * raio * PI;
	}
	
	//Calcular maior elemento de um array
	public static double calcularMaior(double[] array)  throws ArrayIndexOutOfBoundsException{
		
		isEmptyArray(array);
		
		double maior = array[0];
		
		for(int i = 1; i < array.length ; i++) {
			maior = Math.max(maior, array[i]);
		}
		
		return maior;
	}
	
	public static double calcularMenor(double[] array) throws ArrayIndexOutOfBoundsException{

		isEmptyArray(array);
		
		double menor = array[0];
		
		for(int i = 1; i < array.length ; i++) {
			menor = Math.min(menor, array[i]);
		}
		
		return menor;		
	}
	
	public static void isEmptyArray(double[] array) {
		
		if(array.length < 1) {
			throw new ArrayIndexOutOfBoundsException("Empty array");
		}		
	}
}
