package com.acme.prscapstone.product;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name= "products", uniqueConstraints=@UniqueConstraint(name="UIDX_code", columnNames={"code"}))
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(length=30, nullable=false)
	private String partNbr;
	@Column(length=50, nullable=false)
	private String name;
	private BigDecimal price;
	
	
	

}
