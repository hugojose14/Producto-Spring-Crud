package com.example.demo.dominio.model;

import java.util.List;

import com.example.demo.shared.dominio.Id;
import com.example.demo.shared.dominio.nombre_Cliente;
import com.example.demo.shared.dominio.valorTotal;

public class Factura {
	
	private final Id id;
	private final valorTotal valor_total;
	private final nombre_Cliente nombreCliente;
	private final List <Item> items;
	
	private Factura(Id id, valorTotal valor_total, nombre_Cliente nombreCliente, List<Item> items) {
		
		this.id = id;
		this.valor_total = valor_total;
		this.nombreCliente = nombreCliente;
		this.items = items;
	}

	public Id getId() {
		return id;
	}

	public valorTotal getValor_total() {
		return valor_total;
	}

	public nombre_Cliente getNombreCliente() {
		return nombreCliente;
	}
	public List<Item> getItems() {
		return items;
	}
	
	public static Factura of(Id id, valorTotal valor_total, nombre_Cliente nombreCliente, List<Item> items) {
		return new Factura(id, valor_total, nombreCliente, items);
	}
	
	
}
