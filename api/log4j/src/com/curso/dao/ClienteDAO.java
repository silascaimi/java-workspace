package com.curso.dao;

import org.apache.log4j.Logger;

import com.curso.model.Cliente;

public class ClienteDAO {

	private static Logger logger = Logger.getLogger(ClienteDAO.class);
	
	public void salvar(Cliente cliente) {
		
		// Verifica se o root está configurado como Debug
		if(logger.isDebugEnabled()) {
			logger.debug("Salvando o cliente: " + cliente);			
		}
		
		// ...
		// Salvaria no banco de dados
		
		if(logger.isDebugEnabled()) {
			logger.debug("Cliente salvo com sucesso");
		}
	}
}
