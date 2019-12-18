package com.example.demo.infraestructura.repository.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dominio.model.Factura;
import com.example.demo.dominio.services.FacturaService;
import com.example.demo.dominio.services.ProductoService;
import com.example.demo.infraestructura.mapper.FacturaMapper;
import com.example.demo.infraestructura.mapper.ProductoMapper;
import com.example.demo.infraestructura.repository.database.ProductoRepository;
import com.example.demo.repository.FacturaRepository;
import com.example.demo.shared.dominio.Id;

@Service
public class FacturaAdapter implements FacturaService{

	
	@Autowired
	public FacturaRepository facturaRepository;
	
	@Autowired
	public ProductoMapper productoMapper;
	
	@Autowired 
	public FacturaMapper facturaMapper;
	
	
	//Métodos
	
	//buscar factura por ID
	@Override
	public Factura buscarFacturaPorId(Id id) {
		return facturaMapper.convertirDtoToDominio(facturaRepository.findById(id.getId()).get());
	}
	
	//Buscar todas las facturas
	@Override
	public List <Factura>allFacturas (){
		return facturaMapper.convertirListaDtoToDominio(facturaRepository.findAll());
	}
	
	//Guardar la factura
	@Override
	public void guardarFactura(Factura factura) {
		facturaRepository.save(facturaMapper.convertirDominioToDto(factura));
	}
	
	//Eliminar Factura
	@Override
	public void elimimarFactura(Id id) {
		facturaRepository.deleteById(id.getId());
	}
	
	
}
