package com.globomart.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String price;

	public Product(Long id, String name, String price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public Product() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	
}
