package com.example.demo.dominio.services;

import java.util.List;

import com.example.demo.dominio.model.Producto;
import com.example.demo.shared.dominio.Id;

public interface ProductoService {

	public List<Producto> buscarPorIds( List <Id> ids);
	
	public void guardar (Producto producto);
	
	public Producto buscarPorId(Id id);

	public List <Producto> buscarTodo();
}
