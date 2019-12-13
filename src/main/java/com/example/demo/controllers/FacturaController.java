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
import com.example.demo.repository.ProductoRepository;

import com.example.demo.dto.Factura;
import com.example.demo.dto.Item;
import com.example.demo.dto.Producto;

@RestController
@RequestMapping("/factura")
public class FacturaController {

	@Autowired
	private FacturaRepository facturaRepository;
	@Autowired
	private ProductoRepository productoRepository;

	
	@PostMapping()
	void crearFactura(@RequestBody Factura factura) {
		List<String> codigos = new ArrayList();
		for (Item item : factura.getList()) {
			codigos.add(item.getProducto().getCodigo());
		}
		List<Item> guardarEnFactura = new ArrayList();
		List<Producto> productos = productoRepository.findAllById(codigos);
		Double vT = 0.0;
		for (Item item : factura.getList()){
			for (Producto pro : productos) {
				if (pro.getCodigo().equals(item.getProducto().getCodigo())) {
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
	List<Factura> consultar(){
		return facturaRepository.findAll();
	}
}
