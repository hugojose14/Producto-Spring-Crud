package com.example.demo.shared.infraestructure.mapper;

import java.util.List;
import java.util.stream.Collectors;

public interface MapperApiRest<I, O> {

	public I restConvertirDtoToDominio(O o);

	public O restConvertirDominioToDto(I i);

	public default List<O> restConvertirListaToDominioDto(List<I> instancias) {
		return instancias.stream().map(i ->restConvertirDominioToDto(i)).collect(Collectors.toList());
	}
	
	public default List<I> restconvertirListaDtoToDominio(List<O> instancias){
		return instancias.stream().map(this::restConvertirDtoToDominio).collect(Collectors.toList());
	}

}
