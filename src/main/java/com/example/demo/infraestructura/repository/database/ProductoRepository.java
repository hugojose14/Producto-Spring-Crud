package com.example.demo.infraestructura.repository.database;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.ProductoDto;

@Repository
//<Clase, tipo(codigo)>
public interface ProductoRepository extends JpaRepository <ProductoDto,Long>{
	
	
	

}
