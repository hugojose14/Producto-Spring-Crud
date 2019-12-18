package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.ValorNoPermitidoExceptions;;

public class Valor {
	
	
	private final Double valor;
	public Valor(Double valor) {
		
		this.valor = valor;
		
		if((valor<0)) {
			throw new ValorNoPermitidoExceptions();
		}

	}
	public Double getValor() {
		return valor;
	}

}
