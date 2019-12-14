package com.example.demo.infraestructura.repository.adapters;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dominio.model.Producto;
import com.example.demo.dominio.services.ProductoService;
import com.example.demo.infraestructura.mapper.ProductoMapper;
import com.example.demo.infraestructura.repository.database.ProductoRepository;
import com.example.demo.shared.dominio.Id;

@Service
public class ProductoAdapter implements ProductoService{
	
	@Autowired
	public ProductoRepository productoRepository;
	
	@Autowired
	public ProductoMapper productoMapper;
	
	@Override
	public List<Producto> buscarPorIds(List<Id> id) {
		return null;
	}

	@Override
	public void guardar(Producto producto) {
		productoRepository.save(productoMapper.DomToDto(producto));
		
	}

	@Override
	public Producto buscarPorId(Id id) {
		
	}
	
	
	
}