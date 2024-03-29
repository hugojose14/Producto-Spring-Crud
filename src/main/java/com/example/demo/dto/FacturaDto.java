package com.example.demo.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.demo.infraestructura.dto.BaseEntity;

@Entity
public class FacturaDto extends BaseEntity{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double valorTotal;
	private String nombreCliente;
	
	@OneToMany(targetEntity = ItemDto.class,cascade = CascadeType.ALL)
	private List<ItemDto> list;

	public FacturaDto() {

		// TODO Auto-generated constructor stub
	}

	public FacturaDto(Long id, Double valorTotal, String nombreCliente, List<ItemDto> list) {
		this.id = id;
		this.valorTotal = valorTotal;
		this.nombreCliente = nombreCliente;
		//Numero = numero;
		this.list = list;
	}
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	/*public String getNumero() {
		return Numero;
	}

	public void setNumero(String numero) {
		Numero = numero;
	} */

	public List<ItemDto> getList() {
		return list;
	}

	public void setList(List<ItemDto> list) {
		this.list = list;
	}


}
