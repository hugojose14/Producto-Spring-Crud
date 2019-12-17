package com.example.demo.Exceptions;

public class ValorTotalNoPermitidoException  extends RuntimeException{
	
	public ValorTotalNoPermitidoException() {
		super("Valor total no aceptado");
	}
}
