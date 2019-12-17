package com.example.demo.dominio.model;

import com.example.demo.shared.dominio.Cantidad;
import com.example.demo.shared.dominio.Id;
import com.example.demo.shared.dominio.valorTotal;

public class Item {

	private final Id id;
	private final Cantidad cantidad;
	private final valorTotal valor_total;
	private final Producto producto;
	
	private Item(Id id, Cantidad cantidad, valorTotal valor_total, Producto producto) {
		this.id = id;
		this.cantidad = cantidad;
		this.valor_total = valor_total;
		this.producto = producto;
	}

	public Id getId() {
		return id;
	}



	public Cantidad getCantidad() {
		return cantidad;
	}



	public valorTotal getValor_total() {
		return valor_total;
	}



	public Producto getProducto() {
		return producto;
	}



	public static Item of(Id id, Cantidad cantidad, valorTotal valor_total, Producto producto  ) {
		return new Item(id,cantidad,valor_total, producto);
	}
	
}
