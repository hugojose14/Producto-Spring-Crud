package com.example.demo.shared.dominio;

import org.aspectj.weaver.patterns.IfPointcut.IfFalsePointcut;

import com.example.demo.Exceptions.ValorNoPermitidoException;

public class Name {
	
	public Name(String nombreCliente) {
		if(nombreCliente.matches("[A-Z]*")) {
			throw new ValorNoPermitidoException();
		}
	}
}
