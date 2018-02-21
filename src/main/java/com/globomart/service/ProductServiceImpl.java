package com.globomart.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.globomart.domain.Product;
import com.globomart.repository.ProductRepository;
import com.globomart.service.ProductService;
import com.globomart.service.ProductServiceImpl;

@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	public static final Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public void saveProduct(Product product) {
		productRepository.save(product);
	}

	public Product findOne(long id) {
		return productRepository.findOne(id);
	}

	public void delete(long id) {
		productRepository.delete(id);
	}
	
}
