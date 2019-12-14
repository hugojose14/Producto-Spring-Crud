package com.example.demo.dominio.services;

import java.util.List;

import com.example.demo.dominio.model.Producto;
import com.example.demo.shared.dominio.Codigo;
import com.example.demo.shared.dominio.Id;

public interface ProductoService {

	public List<Id> buscarPorIds(List <Id> ids);
	
	public void guardar(Producto producto);
	
	public void buscarPorId(Codigo codigo);
}
