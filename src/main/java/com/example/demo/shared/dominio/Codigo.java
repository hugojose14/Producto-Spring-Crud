package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.ValorNoPermitidoException;

public class Codigo {
	
	public Codigo(String codigo) {
		
		if(codigo.length() >= 64 || codigo.length()<=32 ) {
			throw new ValorNoPermitidoException();
		}
		
		//colocar más 
	}
}