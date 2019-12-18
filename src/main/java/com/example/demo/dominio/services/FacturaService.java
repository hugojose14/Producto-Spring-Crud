package com.example.demo.dominio.services;

import java.util.List;

import com.example.demo.dominio.model.Factura;
import com.example.demo.shared.dominio.Id;

public interface FacturaService {
	
	//Get (Obtener factura por Id)
	public Factura buscarFacturaPorId(Id id);
	
	//Get (Buscar todo)
	public List <Factura> allFacturas();
	
	//Post (Crear facturas)*
	public void guardarFactura (Factura factura);
	
	//Delete (Eliminar facturas)*
	public void elimimarFactura (Id id);

	

}
