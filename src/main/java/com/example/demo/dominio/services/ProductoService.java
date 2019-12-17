package com.example.demo.dominio.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.dominio.model.Producto;
import com.example.demo.dto.ProductoDto;
import com.example.demo.dto.ProductoRestDto;
import com.example.demo.shared.dominio.Id;

public interface ProductoService {

	public List<Producto> buscarPorIds( List <Id> ids);
	
	public void guardar (Producto producto);
	
	public Producto buscarPorId(Id id);

	public List <Producto> buscarTodo();
	
	public void eliminar (Id id);
	
	public void actualizar (Producto producto);
	
	
}
