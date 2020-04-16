package com.java;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class testeBigDecimal {
	
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Informe o valor do produto: ");
		double valor = entrada.nextDouble();
		System.out.println(valor);
		
		DecimalFormat df = new DecimalFormat("R$ #,##0.00");
		
		BigDecimal bd = new BigDecimal(valor);
		bd = bd.divide(BigDecimal.TEN); // Captura a d�cima parte do n�mero
		System.out.println(df.format(bd.doubleValue()));
	}
}
