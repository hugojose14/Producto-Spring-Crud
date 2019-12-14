package com.example.demo.dominio.model;

import com.example.demo.shared.dominio.Codigo;
import com.example.demo.shared.dominio.Id;
import com.example.demo.shared.dominio.Name;
import com.example.demo.shared.dominio.Valor;

public class Producto {
	
	private final Id id;
	private final Codigo codigo;
	private final Valor valor;
	private final Name nombre;
	
	private Producto(Id id, Codigo codigo, Valor valor, Name nombre) {
	
		this.id = id;
		this.codigo = codigo;
		this.valor = valor;
		this.nombre = nombre;
	}

	public Id getId() {
		return id;
	}

	public Codigo getCodigo() {
		return codigo;
	}

	public Valor getValor() {
		return valor;
	}

	public Name getNombre() {
		return nombre;
	}
	
	public static Producto of(Id id, Codigo codigo, Valor valor, Name nombre) {
		return new Producto(id, codigo, valor, nombre);
	}
	
}
