package com.example.demo.dto;

public class ProductoRestDto {
	
	private Long id;
	private String codigo;
	private String nombre;
	private Double valor;
	
	public ProductoRestDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ProductoRestDto(Long id, String codigo, String nombre, Double valor) {
		this.id = id;
		this.codigo = codigo;
		this.nombre = nombre;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	


}
