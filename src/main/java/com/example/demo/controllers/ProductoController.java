package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.aplicacion.ProductoAplication;
import com.example.demo.dto.ProductoRestDto;


import java.util.*; // import the ArrayList class

//decirle que es una api rest
@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	private List <ProductoRestDto> repositorio = new ArrayList<>();
	
	@Autowired
	private ProductoAplication productoAplication;
		
	
	//Crear un producto
	@PostMapping void crear(@RequestBody ProductoRestDto producto) {
		productoAplication.crear(producto);
	
	}
	
	//Obtener producto
	@GetMapping ("/{id}") ProductoRestDto buscar(@PathVariable Long id) {
		
		return productoAplication.buscar(id);
	}
	
	//Obtener productos
	
	@GetMapping() 
	List<ProductoRestDto> consultar(){
		return productoAplication.consultar();
	}
	
	//eliminar producto
	@DeleteMapping ("/{id}")
	void eliminar(@PathVariable Long id){ 
		productoAplication.eliminar(id);
	}
	
	//Actualizar
	@PutMapping ("/{id}")
	void actualizar(@RequestBody ProductoRestDto producto) {
		productoAplication.actualizar(producto);
	}

	

}
