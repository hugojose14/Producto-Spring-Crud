package com.example.demo.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.demo.infraestructura.dto.BaseEntity;

@Entity
@Table(name="items")
public class ItemDto extends BaseEntity {

	private int cantidad;
	private Double valor_total;
	
	public ItemDto() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemDto(Long id, int cantidad, Double valor_total, ProductoDto producto) {
		
		
		this.setId(id);
		this.cantidad = cantidad;
		this.valor_total = valor_total;
		this.producto = producto;
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