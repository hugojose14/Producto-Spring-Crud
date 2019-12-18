package com.example.demo.dto;

import java.util.List;

import com.example.demo.shared.dominio.nombre_Cliente;

public class FacturaRestDto {
	
	private Long id;
	private Double valor_total;
	private String nombreCliente;
	private List<ItemRestDto> list;
	
	public FacturaRestDto() {
		// TODO Auto-generated constructor stub
	}
	
	public FacturaRestDto(Long id, Double valor_total, String nombreCliente, List<ItemRestDto> list) {

		this.id = id;
		this.valor_total = valor_total;
		this.nombreCliente = nombreCliente;
		this.list = list;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getValor_total() {
		return valor_total;
	}

	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public List<ItemRestDto> getList() {
		return list;
	}

	public void setList(List<ItemRestDto> list) {
		this.list = list;
	}
	
	
	
}
