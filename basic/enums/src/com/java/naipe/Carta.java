package com.java.naipe;

public class Carta {
	
	private int numero;
	private Naipe naipe;
	
	Carta(int numero, Naipe naipe){
		this.numero = numero;
		this.naipe = naipe;
	}
	
	public int getNumero() {
		return numero;
	}
	public Naipe getNaipe() {
		return naipe;
	}
	
	

}
