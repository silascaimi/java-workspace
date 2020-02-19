package log4j;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class ConfiguracaoBasica {

	private static Logger logger = Logger.getLogger(ConfiguracaoBasica.class);
	
	public static void main(String[] args) {

		// Aplicando configuração básica para o logger
		BasicConfigurator.configure();
		
		logger.info("Começando a aplicação");
		
	}
}
