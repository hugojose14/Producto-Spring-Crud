package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.ValorNoPermitidoException;

public class Codigo {
	
	private final String value;
	public Codigo(String codigo) {
		
		this.value = codigo;
		
		if(codigo.length() >= 64 || codigo.length()<=32 ) {
			throw new ValorNoPermitidoException();
		}
		
		//colocar más 
	}
	public String getValue() {
		return value;
	}
	
	

}
