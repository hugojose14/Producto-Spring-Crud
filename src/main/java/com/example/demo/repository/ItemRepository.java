package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Item;
import com.example.demo.dto.Producto;

@Repository
//<Clase, tipo(codigo)>
public interface ItemRepository extends JpaRepository <Item,String>{
	
	
	

}