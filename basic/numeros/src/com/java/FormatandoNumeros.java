package com.java;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

@SuppressWarnings("unused")
public class FormatandoNumeros {

	public static void main(String[] args) {

		NumberFormat nf = NumberFormat.getInstance();
		String s = nf.format(1000.5);
		System.out.println(s);
		
		NumberFormat nfIngles = NumberFormat.getInstance(new Locale("en","US"));
		s = nfIngles.format(1000.5);
		System.out.println(s);
		
		// Formatacao de moedas
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();
		String valor = nfMoeda.format(1050.10);
		System.out.println(valor);
		
		
		// DecimalFormat
		DecimalFormat df = new DecimalFormat("R$ ##,##0.00");
		//df.setGroupingUsed(true); 							// habilita o separador de milhar
		//DecimalFormatSymbols dfs = new DecimalFormatSymbols();
		//dfs.setDecimalSeparator(',');
		//df.setDecimalFormatSymbols(dfs);
		String numero = df.format(10035.36);
		System.out.println(numero);
		
		String entrada = "R$ 50,33";
		try {
			double n = df.parse(entrada).doubleValue();
			System.out.println(n);
		} catch (ParseException e) {
			System.out.println("Entrada inv�lida");
		}
		
	}

}
