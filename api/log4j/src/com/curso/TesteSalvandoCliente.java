package com.curso;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.curso.dao.ClienteDAO;
import com.curso.model.Cliente;

public class TesteSalvandoCliente {
	
	private static Logger logger = Logger.getLogger(TesteSalvandoCliente.class);
	
	public static void main(String[] args) {
		
		// Configura o logger a partir do log4j.properties
		PropertyConfigurator.configure("Log4j.properties");
		
		logger.info("Iniciando aplicação");

		Cliente cliente = new Cliente("João");
		new ClienteDAO().salvar(cliente);
		
		logger.info("Finalizando aplicação");
		
	}

}
