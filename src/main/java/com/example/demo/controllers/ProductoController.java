package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Exceptions.RegistroNoEncontradoException;
import com.example.demo.dominio.services.ProductoService;
import com.example.demo.dto.ProductoDto;
import com.example.demo.infraestructura.mapper.ProductoMapper;
import com.example.demo.infraestructura.repository.database.ProductoRepository;
import com.example.demo.shared.dominio.Id;

import java.util.*; // import the ArrayList class

//decirle que es una api rest
@RestController
@RequestMapping("/producto")
public class ProductoController {
	
	private List <ProductoDto> repositorio = new ArrayList<>();
	
	//Ahora es mi repositorio
	@Autowired
	private ProductoService productoService;
	
	@Autowired  
	private ProductoMapper productoMapper;
	
	
	//Crear un producto
	@PostMapping void crear(@RequestBody ProductoDto producto) {
		Random randomNumero = new Random();
		producto.setId(randomNumero.nextLong()%100);
		productoService.guardar(productoMapper.convertirDtoToDominio(producto));
	
	}
	
	//Obtener producto
	@GetMapping ("/{id}") ProductoDto buscar(@PathVariable Long id) {
		
		return productoMapper.convertirDominioToDto(productoService.buscarPorId(new Id(id)));
	}
	
	//Obtener productos
	
	@GetMapping() 
	List<ProductoDto> consultar(){
		return productoMapper.convertirListaDominioToDto(productoService.buscarTodo());
	}
	
	//eliminar producto
	@DeleteMapping ("/{id}")
	ProductoDto eliminar(@PathVariable Long id){ 
		return productoMapper.convertirDominioToDto(productoService.buscarPorId(new Id(id)));
	}
	
	
	
	

}
