package com.example.demo.dto;

import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column("fecha creacion",nulldate=false,)
	
	
	
	
}
