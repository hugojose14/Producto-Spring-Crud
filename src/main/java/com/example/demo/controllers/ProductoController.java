package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Exceptions.RegistroNoEncontradoException;
import com.example.demo.dto.ProductoDto;
import com.example.demo.infraestructura.repository.database.ProductoRepository;

import java.util.*; // import the ArrayList class

//decirle que es una api rest
@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	private List <ProductoDto> repositorio = new ArrayList<>();
	
	@Autowired
	private ProductoRepository productoRepository;
	
	//Crear un producto
	@PostMapping void crear(@RequestBody ProductoDto producto) {
		
		productoRepository.save(producto);
	
	}
	
	//Obtener producto
	@GetMapping ("/{id}") ProductoDto buscar(@PathVariable Long id) {
		
		return productoRepository.findById(id).orElseThrow(()-> new RegistroNoEncontradoException());
	}
	
	//Obtener productos
	
	@GetMapping() 
	List<ProductoDto> consultar(){
		return productoRepository.findAll();
	}
	
	//eliminar producto
	@DeleteMapping ("/{id}")
	ProductoDto eliminar(@PathVariable Long id){ 
		return productoRepository.findById(id).orElseThrow(()-> new RegistroNoEncontradoException());
	}
	
	//actualizar producto
	@PutMapping ()
	public void actualizar( @RequestBody ProductoDto producto) {
		
		 productoRepository.findById(producto.getId()).orElseThrow(()-> new RegistroNoEncontradoException());
		 productoRepository.save(producto);
	
	}
	
	

}
