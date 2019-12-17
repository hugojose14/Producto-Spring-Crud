package com.example.demo.dto;



public class ItemRestDto {
	
	private Long id;
	private int cantidad;
	private Double valor_total;
	private ProductoRestDto producto;
	
	public ItemRestDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemRestDto(Long id, int cantidad, Double valor_total,ProductoRestDto producto) {
	
		this.id = id;
		this.cantidad = cantidad;
		this.valor_total = valor_total;
		this.producto = producto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getValor_total() {
		return valor_total;
	}

	public void setValor_total(Double valor_total) {
		this.valor_total = valor_total;
	}

	public ProductoRestDto getProducto() {
		return producto;
	}

	public void setProducto(ProductoRestDto producto) {
		this.producto = producto;
	}
	
	

}
