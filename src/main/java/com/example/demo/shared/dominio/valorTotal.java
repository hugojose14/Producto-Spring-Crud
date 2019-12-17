package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.ValorTotalNoPermitidoException;

public class valorTotal {
	private final Double valorTotal;
	
	public valorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
		
		if(!(valorTotal > 1.0 && valorTotal<999999.0)); throw new ValorTotalNoPermitidoException();
		
	}
}
