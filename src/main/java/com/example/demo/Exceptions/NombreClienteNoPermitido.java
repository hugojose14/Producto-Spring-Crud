package com.example.demo.Exceptions;

public class NombreClienteNoPermitido extends RuntimeException {
	public NombreClienteNoPermitido(){
		super("Nombre del cliente incorrecto");
	}
}
