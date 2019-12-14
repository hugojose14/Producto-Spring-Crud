package com.example.demo.dominio.model;

import com.example.demo.shared.dominio.Codigo;
import com.example.demo.shared.dominio.Id;
import com.example.demo.shared.dominio.Name;
import com.example.demo.shared.dominio.Valor;

public class Producto {
	
	private Id codigo;
	private Name nombre;
	private Valor valor;
	
	
	public Id getCodigo() {
		return codigo;
	}
	public Name getNombre() {
		return nombre;
	}
	public Valor getValor() {
		return valor;
	}
	public static Producto of(Name name, Valor valor2, Codigo codigo2, Id id) {
		// TODO Auto-generated method stub
		return null;
	}
}
