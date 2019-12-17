package com.example.demo.infraestructura.mapper;

import org.springframework.stereotype.Component;

import com.example.demo.dominio.model.Item;
import com.example.demo.dto.ItemDto;
import com.example.demo.dto.ItemRestDto;
import com.example.demo.shared.dominio.Cantidad;
import com.example.demo.shared.dominio.Id;
import com.example.demo.shared.dominio.valorTotal;
import com.example.demo.shared.infraestructure.mapper.MapperApiRest;
import com.example.demo.shared.infraestructure.mapper.MapperRepository;

@Component
public class ItemMapper implements MapperRepository<Item, ItemDto>,MapperApiRest<Item, ItemRestDto>{
	
	private ProductoMapper productoMapper;
	
	@Override
	public Item convertirDtoToDominio (ItemDto o) {
		return Item.of(new Id(o.getId()), new Cantidad(o.getCantidad()), new valorTotal(o.getValor_total()), productoMapper.convertirDtoToDominio(o.getProducto()));
	}

	@Override
	public ItemDto convertirDominioToDto(Item i) {
		return new ItemDto((i.getId().getId()),i.getCantidad().getCantidad(),i.getValor_total().getValorTotal(),productoMapper.convertirDominioToDto(i.getProducto()));
	}
	
	@Override
	public ItemRestDto restConvertirDominioToDto(Item o) {
		return new ItemRestDto(o.getId().getId(),o.getCantidad().getCantidad(),o.getValor_total().getValorTotal(),productoMapper.restConvertirDominioToDto(o.getProducto()));
	}
	
	@Override
	public Item restConvertirDtoToDominio (ItemRestDto i) {
		return Item.of(new Id(i.getId()), new Cantidad(i.getCantidad()), new valorTotal(i.getValor_total()), productoMapper.restConvertirDtoToDominio(i.getProducto()));
	}
	
	
	
	
}
