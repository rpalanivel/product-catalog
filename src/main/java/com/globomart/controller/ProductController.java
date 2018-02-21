package com.globomart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.globomart.domain.Product;
import com.globomart.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = "/add/{id}/{name}/{price}")
	public Product addProduct(@PathVariable int id, @PathVariable String name,
			@PathVariable String price) {
		Product product = new Product();
		product.setId((long) id);
		product.setName(name);
		product.setPrice(price);
		productService.saveProduct(product);
		return product;
	}
	@RequestMapping(value = "/delete/{id}")
	public void deleteProduct(@PathVariable int id) {
		Product product = new Product();
		product.setId((long)id);
		productService.delete(id);
	}
	@RequestMapping(value = "/")
	public List<Product> getProducts() {
		return productService.findAll();
	}
	@RequestMapping(value = "/{id}")
	public Product getProduct(@PathVariable int id) {
		Product product = productService.findOne(id);
		return product;
	}
		
}
