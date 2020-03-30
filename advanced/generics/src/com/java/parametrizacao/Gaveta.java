package com.java.parametrizacao;

import java.util.ArrayList;
import java.util.List;

public class Gaveta<E> {

	private List<E> colecao = new ArrayList<>();
	
	public void colocarItem(E e) {
		colecao.add(e);		
	}
	
	public E retirarPrimeiro() {
		return colecao.get(0);
	}
}
