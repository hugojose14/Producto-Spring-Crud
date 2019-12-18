package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.FacturaRepository;
import com.example.demo.repository.ItemRepository;
import com.example.demo.shared.dominio.Id;
import com.example.demo.dominio.services.FacturaService;
import com.example.demo.dominio.services.ProductoService;
import com.example.demo.dto.FacturaDto;
import com.example.demo.dto.FacturaRestDto;
import com.example.demo.dto.ItemDto;
import com.example.demo.dto.ItemRestDto;
import com.example.demo.dto.ProductoDto;
import com.example.demo.dto.ProductoRestDto;
import com.example.demo.infraestructura.mapper.FacturaMapper;
import com.example.demo.infraestructura.mapper.ProductoMapper;
import com.example.demo.infraestructura.repository.database.ProductoRepository;

@RestController
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	private FacturaService facturaService;
	@Autowired
	private ProductoService productoService;
	
	@Autowired
	private ProductoMapper productoMapper;
	
	@Autowired
	private FacturaMapper facturaMapper;
	
	
	@PostMapping()
	void crearFactura(@RequestBody FacturaRestDto factura) {
		
		Random randomNumero = new Random();
		factura.setId(randomNumero.nextLong()%100);
		List<Id> codigos=factura.getList().stream().map(c-> new Id(c.getId())).collect(Collectors.toList());
		List<ItemRestDto> guardarEnFactura = new ArrayList<>();
		List<ProductoRestDto> productos = productoMapper.restConvertirListaToDominioDto(productoService.buscarPorIds(codigos));
		Double vT = 0.0;
		for (ItemRestDto item : factura.getList()) {
			for (ProductoRestDto pro : productos) {
				if (pro.getId().equals(item.getProducto().getId())) {
					item.setProducto(pro); 
					item.setValor_total(item.getCantidad()*pro.getValor());
					vT = vT + (item.getCantidad() * pro.getValor());
					guardarEnFactura.add(item);
				}
			}
		}
		factura.setValor_total(vT);
		factura.setList(guardarEnFactura);
	facturaService.guardarFactura(facturaMapper.restConvertirDtoToDominio(factura));

	}
	
	//Obtener las facturas
	@GetMapping() 
	List<FacturaRestDto> consultar(){
		return facturaMapper.restConvertirListaToDominioDto(facturaService.allFacturas());
	}
	
	//Eliminar las facturas
	
	
	
}
