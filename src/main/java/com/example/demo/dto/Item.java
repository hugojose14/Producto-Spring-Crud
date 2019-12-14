package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="items")
public class Item extends BaseEntity {


	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	private int cantidad;
	private Double valor_total;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(Long id, int cantidad, Double valor_total, ProductoDto producto) {
		super();
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

	public ProductoDto getProducto() {
		return producto;
	}

	public void setProducto(ProductoDto producto) {
		this.producto = producto;
	}












	@OneToOne(targetEntity =ProductoDto.class)
	private ProductoDto producto;
}