package com.example.demo.aplicacion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Exceptions.RegistroNoEncontradoException;
import com.example.demo.dominio.services.ProductoService;
import com.example.demo.dto.ProductoRestDto;
import com.example.demo.infraestructura.mapper.ProductoMapper;
import com.example.demo.infraestructura.repository.database.ProductoRepository;
import com.example.demo.shared.dominio.Id;

import java.util.*; // import the ArrayList class

@Component
public class ProductoAplication {

	//Ahora es mi repositorio
	@Autowired
	private ProductoService productoService;
	
	@Autowired  
	private ProductoMapper productoMapper;
	
	
	//Crear un producto
	 public void crear( ProductoRestDto producto) {
		Random randomNumero = new Random();
		producto.setId(randomNumero.nextLong()%100);
		productoService.guardar(productoMapper.restConvertirDtoToDominio(producto));
	
	}
	
	//Obtener producto
	public ProductoRestDto buscar( Long id) {
		
		return productoMapper.restConvertirDominioToDto(productoService.buscarPorId(new Id(id)));
	}
	
	//Obtener productos
	
	
	public List<ProductoRestDto> consultar(){
		return productoMapper.restConvertirListaToDominioDto(productoService.buscarTodo());
	}
	
	//eliminar producto
	public void  eliminar( Long id){ 
		
		productoMapper.restConvertirDominioToDto(productoService.buscarPorId(new Id(id)));
		productoService.eliminar(new Id(id));
	}
	
	//Update product
	
	public void actualizar(ProductoRestDto producto) {
		if(productoService.buscarPorId(new Id(producto.getId())) == null){
			throw new RegistroNoEncontradoException();
		}else {
			productoService.actualizar(productoMapper.restConvertirDtoToDominio(producto));
		}
	}
	
	

}
