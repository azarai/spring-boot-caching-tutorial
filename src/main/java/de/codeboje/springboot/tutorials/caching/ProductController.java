package de.codeboje.springboot.tutorials.caching;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("product/{id}")
	public Product getProduct(@PathVariable("id") String id) {
		LOGGER.info("getProduct called for id {}", id);
		return productService.getProduct(id);
	}
	
	@PostMapping("product/{id}")
	public Product updateProduct(@PathVariable("id") String id, @RequestBody Product product) {
		LOGGER.info("updateProduct called for id {}", id);
		product.setId(id);
		productService.updateProduct(product);
		return productService.getProduct(id);
	}
}
