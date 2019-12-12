package com.example.demo.Exceptions;

public class RegistroNoEncontradoException extends RuntimeException {
	
	public RegistroNoEncontradoException() {
		super("Not found");
	}
}
