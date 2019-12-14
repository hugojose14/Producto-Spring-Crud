package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.ValorNoPermitidoException;

public class Id {
	
	private final Long value;
	public Id(Long id){
		
		this.value = id;
		
		if(id>99999999) {
			throw new ValorNoPermitidoException();
		}
	}
	public Long getValue() {
		return value;
	}
	
	

}
