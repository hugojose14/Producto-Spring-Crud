package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.CantidadNoPermitidaException;

public class Cantidad {

	private final int cantidad;
	
	public Cantidad(int cantidad) {
		this.cantidad = cantidad;
		
		if(!(cantidad>1 && cantidad<9999999) ); throw new CantidadNoPermitidaException();
		
	}

	public int getCantidad() {
		return cantidad;
	}
	
	
}
