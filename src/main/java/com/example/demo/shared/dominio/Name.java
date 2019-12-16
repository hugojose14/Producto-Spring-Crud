package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.NameNoPermitidoException;

public class Name {
	
	private final String nombre;
	
	public Name(String nombre) {
		
		this.nombre = nombre;
		
		if(!nombre.matches("[A-Z\\s]+")) {
			throw new NameNoPermitidoException();
		}
		
		
		
	}

	public String getName() {
		return nombre;
	}
	
	
}
