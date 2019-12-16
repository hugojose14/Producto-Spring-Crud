package com.example.demo.shared.infraestructure.mapper;

import java.util.List;
import java.util.stream.Collectors;

public interface MapperRepository <I, O>{
	public I convertirDtoToDominio(O o);
	public O convertirDominioToDto(I i);
	
	public default List<O> convertirListaDominioToDto(List<I> instancias){
		//dato de entrada (i)
		return instancias.stream().map(i ->
		
		//dato de salida
		convertirDominioToDto(i)
		).collect(Collectors.toList());
	}
	public default List<I> convertirListaDtoToDominio(List<O> instancias){
		return instancias.stream().map(this::convertirDtoToDominio).collect(Collectors.toList());
	}
}