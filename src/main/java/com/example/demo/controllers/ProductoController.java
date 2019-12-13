package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Exceptions.RegistroNoEncontradoException;
import com.example.demo.dto.Producto;
import com.example.demo.repository.ProductoRepository;

import java.util.*; // import the ArrayList class

//decirle que es una api rest
@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	private List <Producto> repositorio = new ArrayList<>();
	
	@Autowired
	private ProductoRepository productoRepository;
	
	//Crear un producto
	@PostMapping void crear(@RequestBody Producto producto) {
		
		productoRepository.save(producto);
	
	}
	
	//Obtener producto
	@GetMapping ("/{id}") Producto buscar(@PathVariable Long id) {
		
		return productoRepository.findById(id).orElseThrow(()-> new RegistroNoEncontradoException());
	}
	
	//Obtener productos
	
	@GetMapping() 
	List<Producto> consultar(){
		return productoRepository.findAll();
	}
	
	//eliminar producto
	@DeleteMapping ("/{id}")
	Producto eliminar(@PathVariable Long id){ 
		return productoRepository.findById(id).orElseThrow(()-> new RegistroNoEncontradoException());
	}
	
	//actualizar producto
	@PutMapping ()
	public void actualizar( @RequestBody Producto producto) {
		
		 productoRepository.findById(producto.getId()).orElseThrow(()-> new RegistroNoEncontradoException());
		 productoRepository.save(producto);
	
	}
	
	

}
