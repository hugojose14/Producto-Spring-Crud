package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.ValorNoPermitidoException;

public class Codigo {
	
	private final String codigo;
	public Codigo(String codigo) {
		
		this.codigo = codigo;
		
		if(codigo.length() >= 64 || codigo.length()<=32 ) {
			throw new ValorNoPermitidoException();
		}
		
		//colocar más 
	}
	public String getCodigo() {
		return codigo;
	}
	
	

}
