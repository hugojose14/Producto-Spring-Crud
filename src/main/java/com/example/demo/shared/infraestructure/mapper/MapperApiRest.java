package com.example.demo.shared.infraestructure.mapper;

public interface MapperApiRest <I, O>{
	public I DtoToDom(O o);
	public O DomToDto(I i);
}