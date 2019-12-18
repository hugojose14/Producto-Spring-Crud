package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.FacturaDto;
import com.example.demo.dto.ProductoDto;

@Repository
//<Clase, tipo(codigo)>
public interface FacturaRepository extends JpaRepository <FacturaDto,Long>{
	
	
	

}
