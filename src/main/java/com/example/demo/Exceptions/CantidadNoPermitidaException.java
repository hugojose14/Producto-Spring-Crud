package com.example.demo.Exceptions;

public class CantidadNoPermitidaException extends RuntimeException {
	
	public CantidadNoPermitidaException() {
		super("Cantidad no permitida");
	}

}
