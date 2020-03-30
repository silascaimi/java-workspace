package com.java.parametrizacao;

import java.util.List;

public class RetiraElementos {
	
	public static <T> T recuperaPrimeiro(List<T> item){
		
		return item.get(0);
	}
	
}
