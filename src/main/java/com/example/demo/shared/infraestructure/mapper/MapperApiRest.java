package com.example.demo.shared.infraestructure.mapper;

import java.util.List;
import java.util.stream.Collectors;

public interface MapperApiRest <I, O>{
	public I DtoToDom(O o);
	public O DomToDto(I i);
	
	public default List<O> convertir(List<I> instancias){
		return instancias.stream().map(this::DomToDto).collect(Collectors.toList());
	}
	public default List<I> recibir(List<O> instancias){
		return instancias.stream().map(this::DtoToDom).collect(Collectors.toList());
	}
}