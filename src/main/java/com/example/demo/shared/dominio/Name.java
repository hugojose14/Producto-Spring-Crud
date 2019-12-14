package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.ValorNoPermitidoException;

public class Name {
	
	private final String nombre;
	
	public Name(String nombre) {
		
		this.nombre = nombre;
		
		if(nombre.matches("[A-Z]*")) {
			throw new ValorNoPermitidoException();
		}
	}

	public String getName() {
		return nombre;
	}
	
	
}
