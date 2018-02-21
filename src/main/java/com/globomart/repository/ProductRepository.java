package com.globomart.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.globomart.domain.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {

}

