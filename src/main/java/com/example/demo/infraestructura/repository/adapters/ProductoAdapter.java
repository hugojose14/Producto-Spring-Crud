package com.example.demo.infraestructura.repository.adapters;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.spi.ValidationProvider;

import org.aspectj.weaver.bcel.UnwovenClassFileWithThirdPartyManagedBytecode.IByteCodeProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Exceptions.RegistroNoEncontradoException;
import com.example.demo.dominio.model.Producto;
import com.example.demo.dominio.services.ProductoService;
import com.example.demo.infraestructura.mapper.ProductoMapper;
import com.example.demo.infraestructura.repository.database.ProductoRepository;
import com.example.demo.shared.dominio.Id;

@Service
public class ProductoAdapter implements ProductoService {

	// todo lo que conecta la base de datos
	@Autowired
	public ProductoRepository productoRepository;

	@Autowired
	public ProductoMapper productoMapper;

	@Override
	public List<Producto> buscarPorIds(List<Id> ids) {
		// ProductoRepository, pero en dto
		return productoRepository.findAllById(ids.stream().map(codigos -> codigos.getId()).collect(Collectors.toList()))
				.stream().map(productos -> productoMapper.convertirDtoToDominio(productos))
				.collect(Collectors.toList());

	}

	@Override
	public List<Producto> buscarTodo() {
		return productoMapper.convertirListaDtoToDominio(productoRepository.findAll());
	}

	@Override
	public void guardar(Producto producto) {
		productoRepository.save(productoMapper.convertirDominioToDto(producto));
	}

	@Override
	public Producto buscarPorId(Id id) {
		return productoMapper.convertirDtoToDominio(
				productoRepository.findById(id.getId()).orElseThrow(() -> new RegistroNoEncontradoException()));
	}
	
	//Eliminar
	
	@Override
	public void eliminar(Id id) {
		productoRepository.deleteById(id.getId());
	}
	//Actualizar
	
	@Override
	public void actualizar(Producto producto) {
		productoRepository.save(productoMapper.convertirDominioToDto(producto));
	}
	
	
	
}