package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.NombreClienteNoPermitido;

public class nombre_Cliente {
	
	private final String nombreCliente;
	
	public nombre_Cliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
		String expression = "[a-zA-Z\\\\s]";
		if(!(nombreCliente.matches(expression))) {
			throw new NombreClienteNoPermitido();
		}
		
		
	}

	public String getNombreCliente() {
		return nombreCliente;
	}
	
	
}
