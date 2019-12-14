package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.ValorNoPermitidoException;

public class Name {
	
	private final String value;
	
	public Name(String nombreCliente) {
		
		this.value = nombreCliente;
		
		if(nombreCliente.matches("[A-Z]*")) {
			throw new ValorNoPermitidoException();
		}
	}

	public String getValue() {
		return value;
	}
	
	
}
