package com.java.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Aplicacao {

	public static void main(String[] args) {

		List<Bebida> bebidas = new ArrayList<>();
		
		bebidas.add(new Cafe());
		bebidas.add(new Cha());
		
		prepararBebidas(bebidas);
		
		
		
		List<Cha> chas = new ArrayList<>();
		
		chas.add(new Cha());
		prepararBebidas2(chas);

	}
	
	// Método que recebe Bebida e qualquer subblasse dela
	public static void prepararBebidas(List<? extends Bebida> bebidas) {
		
		// Não pode adicionar novo elemento na lista
		
		for (Bebida bebida : bebidas) {
			bebida.preparar();
		}
	}
	
	
	// Método que recebe Cha e qualquer super classe
	public static void prepararBebidas2(List<? super Cha> bebidas) {

		for (Object bebida : bebidas) {
			((Cha) bebida).preparar();
		}
	}
	
	// Método que recebe qualquer tipo
	public static void prepararBebidas3(List<?> bebidas) {
		
		for (Object bebida : bebidas) {
			((Bebida) bebida).preparar();
		}
	}
	
	

}
