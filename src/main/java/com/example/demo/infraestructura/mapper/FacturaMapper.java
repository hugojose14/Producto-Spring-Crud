package com.example.demo.infraestructura.mapper;

import org.springframework.stereotype.Component;

import com.example.demo.dominio.model.Factura;
import com.example.demo.dominio.model.Item;
import com.example.demo.dto.FacturaDto;
import com.example.demo.dto.FacturaRestDto;
import com.example.demo.shared.infraestructure.mapper.MapperApiRest;
import com.example.demo.shared.infraestructure.mapper.MapperRepository;

@Component
public class FacturaMapper implements MapperRepository<Factura, FacturaDto>,MapperApiRest<Factura,FacturaRestDto > {

	@Override
	public Factura restConvertirDtoToDominio(FacturaRestDto o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FacturaRestDto restConvertirDominioToDto(Factura i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factura convertirDtoToDominio(FacturaDto o) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FacturaDto convertirDominioToDto(Factura i) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
