package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.IdNoPermitidoException;


public class Id {
	
	private final Long id;
	public Id(Long id){
		
		this.id = id;
		
		if(id>99999999) {
			throw new IdNoPermitidoException();
		}
	}
	public Long getId() {
		return id;
	}
	
	

}
