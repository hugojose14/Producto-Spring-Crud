package com.example.demo.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.UUID;
import java.util.logging.*;

@RestControllerAdvice
public class ExceptionsHandler {

	// obtener el id o nombre especifico del error (Logger)
	private static final Logger LOG = Logger.getLogger(ExceptionHandler.class.getName());

	/*
	@ExceptionHandler(Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorCode handleException(Exception e) {

		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.generatedId());
		ec.setMensaje("Error no encontrado");
		// recibe el errorCode y la exception
		logError(ec, e);
		return ec;

	}*/

	@ExceptionHandler(RegistroNoEncontradoException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	public ErrorCode registroNoEncontrado(RegistroNoEncontradoException e) {
		// TODO Auto-generated constructor stub
		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.generatedId());
		ec.setMensaje(e.getMessage());
		// recibe el errorCode y la exception
		logError(ec, e);
		return ec;

	}

	// para el valor
	@ExceptionHandler(ValorNoPermitidoExceptions.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorCode ValorNoPermitido(ValorNoPermitidoExceptions e) {
		// TODO Auto-generated constructor stub
		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.generatedId());
		ec.setMensaje(e.getMessage());
		// recibe el errorCode y la exception
		logError(ec, e);
		return ec;

	}

	// para el codigo
	@ExceptionHandler(CodigoNoPermitidoException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorCode CodigoNoPermitido(CodigoNoPermitidoException e) {
		// TODO Auto-generated constructor stub
		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.generatedId());
		ec.setMensaje(e.getMessage());
		// recibe el errorCode y la exception
		logError(ec, e);
		return ec;

	}

	// para el id
	@ExceptionHandler(IdNoPermitidoException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorCode IdNoPermitido(IdNoPermitidoException e) {
		// TODO Auto-generated constructor stub
		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.generatedId());
		ec.setMensaje(e.getMessage());
		// recibe el errorCode y la exception
		logError(ec, e);
		return ec;

	}

	// para el id
	@ExceptionHandler(NameNoPermitidoException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorCode NameNoPermitido(NameNoPermitidoException e) {
		// TODO Auto-generated constructor stub
		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.generatedId());
		ec.setMensaje(e.getMessage());
		// recibe el errorCode y la exception
		logError(ec, e);
		return ec;

	}

	// Excepciones para cantidad, valorTotal

	// Para la cantidad
	@ExceptionHandler(CantidadNoPermitidaException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorCode CantidadNoPermitida(CantidadNoPermitidaException e) {
		// TODO Auto-generated constructor stub
		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.generatedId());
		ec.setMensaje(e.getMessage());
		// recibe el errorCode y la exception
		logError(ec, e);
		return ec;

	}

	// Para el valor total

	// Para la cantidad
	@ExceptionHandler(ValorTotalNoPermitidoException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorCode ValorTotalNoPermitido(ValorTotalNoPermitidoException e) {
		// TODO Auto-generated constructor stub
		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.generatedId());
		ec.setMensaje(e.getMessage());
		// recibe el errorCode y la exception
		logError(ec, e);
		return ec;

	}

	// Para la Factura
	
	//Nombre de cliente
	@ExceptionHandler(NombreClienteNoPermitido.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorCode nombreClienteNoPermitido(NombreClienteNoPermitido e) {
		// TODO Auto-generated constructor stub
		ErrorCode ec = new ErrorCode();
		ec.setCodigo(this.generatedId());
		ec.setMensaje(e.getMessage());
		// recibe el errorCode y la exception
		logError(ec, e);
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
