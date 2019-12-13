package com.example.demo.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Factura {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private Double valorTotal;
	private String nombreCliente;
	private String Numero;
	
	
	public Factura() {
		// TODO Auto-generated constructor stub
	}
	

	public Factura(long id, Double valorTotal, String nombreCliente, String numero, List<Item> list) {
		super();
		this.id = id;
		this.valorTotal = valorTotal;
		this.nombreCliente = nombreCliente;
		Numero = numero;
		this.list = list;
	}



	@OneToMany(targetEntity = Item.class,cascade = CascadeType.ALL)
	private List<Item> list;



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public Double getValorTotal() {
		return valorTotal;
	}



	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}



	public String getNombreCliente() {
		return nombreCliente;
	}



	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}



	public String getNumero() {
		return Numero;
	}



	public void setNumero(String numero) {
		Numero = numero;
	}



	public List<Item> getList() {
		return list;
	}



	public void setList(List<Item> list) {
		this.list = list;
	}

	
	
	
	
}
