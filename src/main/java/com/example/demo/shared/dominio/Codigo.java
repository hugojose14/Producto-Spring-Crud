package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.CodigoNoPermitidoException;


public class Codigo {
	
	private final String codigo;
	public Codigo(String codigo) {
		
		this.codigo = codigo;
		
		if(!(codigo.length() <= 7 || codigo.length()>=10 )) {
			throw new CodigoNoPermitidoException();
		}
		
		//colocar más 
	}
	public String getCodigo() {
		return codigo;
	}
	
	

}
