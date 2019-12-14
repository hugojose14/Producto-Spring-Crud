package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.ValorNoPermitidoException;

public class Valor {
	
	
	private final Double valor;
	public Valor(Double valor) {
		
		this.valor = valor;
		
		if(valor < 1.0) {
			throw new ValorNoPermitidoException();
		}
		
		if(valor> 99999.0) {
			throw new ValorNoPermitidoException();
		}
		
	}
	public Double getValor() {
		return valor;
	}

	
	
	
}
