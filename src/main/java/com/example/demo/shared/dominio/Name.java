package com.example.demo.shared.dominio;

import com.example.demo.Exceptions.ValorNoPermitidoException;

public class Name {
	
	public Name(String nombreCliente) {
		if(nombreCliente.matches("[a-z]*")) {
			throw new ValorNoPermitidoException();
		}
	}
}
