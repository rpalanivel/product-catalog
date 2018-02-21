package com.globomart.service;

import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import com.globomart.domain.Product;

public interface ProductService {

	public List<Product> findAll();
	public void saveProduct(Product product);
	
	@Cacheable ("products")
	public Product findOne(long id);
	public void delete(long id);
}
