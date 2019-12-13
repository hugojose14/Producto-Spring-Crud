package com.example.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.dto.ErrorCode;

import java.util.UUID;
import java.util.logging.*; 

@RestControllerAdvice
public class ExceptionsHandler {
	
	//obtener el id o nombre especifico del error (Logger)
	private static final Logger LOG = Logger.getLogger (ExceptionHandler.class.getName());
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorCode handleException(Exception e) {
		
		ErrorCode ec =new ErrorCode();
		ec.setCodigo(this.generatedId());
		ec.setMensaje("Error no encontrado");
		//recibe el errorCode y la exception
		logError(ec,e );
		return ec;
		
	}
	
	@ExceptionHandler(RegistroNoEncontradoException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorCode registroNoEncontrado(RegistroNoEncontradoException e) {
		// TODO Auto-generated constructor stub
		ErrorCode ec =new ErrorCode();
		ec.setCodigo(this.generatedId());
		ec.setMensaje(e.getMessage());
		//recibe el errorCode y la exception
		logError(ec,e );
		return ec;
		
	}
	
	@ExceptionHandler(ValorNoPermitidoException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorCode ValorNoPermitido(ValorNoPermitidoException e) {
		// TODO Auto-generated constructor stub
		ErrorCode ec =new ErrorCode();
		ec.setCodigo(this.generatedId());
		ec.setMensaje(e.getMessage());
		//recibe el errorCode y la exception
		logError(ec,e );
		return ec;
		
	}
	
	private void logError(ErrorCode ec, Exception e) {
		
		LOG.severe(ec.getCodigo());
		LOG.severe(ec.getMensaje());
		LOG.severe(ec.getCodigo());
		LOG.severe(e.getMessage());
		
	}
	
	public String generatedId() {
		return UUID.randomUUID().toString();
		
	}
	
	
	
	
	
}


