package com.example.demo.Exceptions;

public class ValorNoPermitidoException extends RuntimeException {
	
	public ValorNoPermitidoException() {
		super("El Valor es incorrecto");
	}
}
