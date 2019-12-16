package com.example.demo.infraestructura.mapper;

import org.springframework.stereotype.Component;

import com.example.demo.dominio.model.Producto;
import com.example.demo.dto.ProductoDto;
import com.example.demo.dto.ProductoRestDto;
import com.example.demo.shared.dominio.Codigo;
import com.example.demo.shared.dominio.Id;
import com.example.demo.shared.dominio.Name;
import com.example.demo.shared.dominio.Valor;
import com.example.demo.shared.infraestructure.mapper.MapperApiRest;
import com.example.demo.shared.infraestructure.mapper.MapperRepository;

@Component
public class ProductoMapper implements MapperRepository<Producto, ProductoDto>, MapperApiRest<ProductoRestDto, Producto>{
	@Override
	public Producto convertirDtoToDominio(ProductoDto o) { 
		return Producto.of(new Id(o.getId()),new Codigo(o.getCodigo()),new Valor(o.getValor()),new Name(o.getNombre()));
	}
	@Override
	public ProductoDto convertirDominioToDto(Producto i) {
		// TODO Auto-generated method stub
		return new ProductoDto(i.getId().getId(),i.getCodigo().getCodigo(),i.getNombre().getName(),i.getValor().getValor());
	}
	@Override
	public ProductoRestDto restConvertirDtoToDominio(Producto o) {
		// TODO Auto-generated method stub
		//return new ProductoRestDto(o.getId(), o.getCodigo().getCodigo(), o.getNombre().getName(), o.getValor().getValor());
		return null;
	}
	@Override
	public Producto restConvertirDominioToDto(ProductoRestDto i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
}
