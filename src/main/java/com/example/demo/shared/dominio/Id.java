package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.ValorNoPermitidoException;

public class Id {
	
	public Id(Long id){
		if(id>99999999) {
			throw new ValorNoPermitidoException();
		}
	}

}
