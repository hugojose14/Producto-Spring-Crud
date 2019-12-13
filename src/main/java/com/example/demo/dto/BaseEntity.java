package com.example.demo.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name= "fecha_creacion",nullable=false,updatable =true)
	@CreatedDate
	Date fecha_creacion;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name= "fecha_actualizada",nullable=false,updatable =true)
	@CreatedDate
	Date fecha_actualizada;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Date getFecha_actualizada() {
		return fecha_actualizada;
	}

	public void setFecha_actualizada(Date fecha_actualizada) {
		this.fecha_actualizada = fecha_actualizada;
	}
	
	
	
	
	
} 
