package com.globomart;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.globomart.domain.Product;
import com.globomart.repository.ProductRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class GlobomartApplicationTests {

	@Autowired
    private ProductRepository productRepository;

    @Test
    public void save() {
    	Product product = new Product();
		product.setId(100);
		product.setName("Test product");
		product.setPrice("1111");
    	Product productEntity = productRepository.save(product);
    	Product foundEntity = productRepository.findOne(productEntity.getId());
        assertNotNull(foundEntity);
        assertEquals(productEntity.getId(), foundEntity.getId());
    }

}
