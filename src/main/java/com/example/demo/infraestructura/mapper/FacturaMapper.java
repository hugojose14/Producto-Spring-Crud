package com.example.demo.infraestructura.mapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dominio.model.Factura;
import com.example.demo.dominio.model.Item;
import com.example.demo.dto.FacturaDto;
import com.example.demo.dto.FacturaRestDto;
import com.example.demo.shared.dominio.Id;
import com.example.demo.shared.dominio.nombre_Cliente;
import com.example.demo.shared.dominio.valorTotal;
import com.example.demo.shared.infraestructure.mapper.MapperApiRest;
import com.example.demo.shared.infraestructure.mapper.MapperRepository;

@Component
public class FacturaMapper implements MapperRepository<Factura, FacturaDto>,MapperApiRest<Factura,FacturaRestDto > {
	
	@Autowired
	private ProductoMapper productoMapper;
	@Autowired
	private ItemMapper itemMapper;
	
	@Override
	public Factura restConvertirDtoToDominio(FacturaRestDto i) {
		// TODO Auto-generated method stub
		return Factura.of(new Id(i.getId()), new valorTotal(i.getValor_total()),new nombre_Cliente(i.getNombreCliente()),itemMapper.restconvertirListaDtoToDominio(i.getList()));
	}

	@Override
	//Me está viniendo de Factura (dominio), lo paso a Rest(método)
	public FacturaRestDto restConvertirDominioToDto(Factura o) {
		// TODO Auto-generated method stub
		return new FacturaRestDto(o.getId().getId(),o.getValor_total().getValorTotal(),o.getNombreCliente().getNombreCliente(),itemMapper.restConvertirListaToDominioDto(o.getItems()));
	}

	@Override
	public Factura convertirDtoToDominio(FacturaDto o) {
		
		return Factura.of(new Id(o.getId()), new valorTotal(o.getValorTotal()), new nombre_Cliente(o.getNombreCliente()), itemMapper.convertirListaDtoToDominio(o.getList()));
		
	}

	@Override
	public FacturaDto convertirDominioToDto(Factura i) {
		// TODO Auto-generated method stub
		return new FacturaDto(i.getId().getId(),i.getValor_total().getValorTotal(),i.getNombreCliente().getNombreCliente(),itemMapper.convertirListaDominioToDto(i.getItems()));
	}

	
	
	
}
