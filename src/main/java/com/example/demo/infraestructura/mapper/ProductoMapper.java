package com.example.demo.infraestructura.mapper;

import com.example.demo.dominio.model.Producto;
import com.example.demo.dto.ProductoDto;
import com.example.demo.shared.dominio.Codigo;
import com.example.demo.shared.dominio.Id;
import com.example.demo.shared.dominio.Name;
import com.example.demo.shared.dominio.Valor;
import com.example.demo.shared.infraestructure.mapper.MapperApiRest;

public class ProductoMapper implements MapperApiRest<Producto, ProductoDto>{
	@Override
	public Producto DtoToDom(ProductoDto o) { 
		return Producto.of(new Id(o.getId()),new Codigo(o.getCodigo()),new Valor(o.getValor()),new Name(o.getNombre()));
	}
	@Override
	public ProductoDto DomToDto(Producto i) {
		// TODO Auto-generated method stub
		return new ProductoDto(i.getId().getId(),i.getCodigo().getCodigo(),i.getNombre().getName(),i.getValor().getValor());
	}
	
}
