package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.FacturaRepository;
import com.example.demo.repository.ItemRepository;
import com.example.demo.dto.FacturaDto;
import com.example.demo.dto.ItemDto;
import com.example.demo.dto.ProductoDto;
import com.example.demo.infraestructura.repository.database.ProductoRepository;

@RestController
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	private FacturaRepository facturaRepository;
	@Autowired
	private ProductoRepository productoRepository;

	
	@PostMapping()
	void crearFactura(@RequestBody FacturaDto factura) {
		List<Long> codigos = new ArrayList();
		for (ItemDto item : factura.getList()) {
			codigos.add(item.getProducto().getId());
		}
		List<ItemDto> guardarEnFactura = new ArrayList();
		List<ProductoDto> productos = productoRepository.findAllById(codigos);
		Double vT = 0.0;
		for (ItemDto item : factura.getList()) {
			for (ProductoDto pro : productos) {
				if (pro.getId().equals(item.getProducto().getId())) {
					item.setProducto(pro); 
					item.setValor_total(item.getCantidad()*pro.getValor());
					vT = vT + (item.getCantidad() * pro.getValor());
					guardarEnFactura.add(item);
				}
			}
		}
		factura.setValorTotal(vT);
		factura.setList(guardarEnFactura);
		facturaRepository.save(factura);

	}
	
	//Obtener las facturas
	@GetMapping() 
	List<FacturaDto> consultar(){
		return facturaRepository.findAll();
	}
}
