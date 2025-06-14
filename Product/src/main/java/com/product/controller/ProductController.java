package com.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.product.Service.IProductService;
import com.product.entity.Product;

@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	private IProductService service;
	
	@PostMapping("/product")
	public ResponseEntity<Product> createProduct(@RequestBody Product product){		
	    Product prod=service.addProduct(product);	    
		return new ResponseEntity<Product>(prod, HttpStatus.CREATED);		
	}
	
	@GetMapping("/product")
	public ResponseEntity<Product> getProductById(@RequestParam("id") Integer id){
		Product prod=service.getProductById(id);
		return new ResponseEntity<Product>(prod,HttpStatus.OK);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> prods=service.getAllProducts();
		return new ResponseEntity<>(prods,HttpStatus.OK);		
	}
	@DeleteMapping("/delprod")
	public ResponseEntity<Product> deleteProduct(@RequestParam("id") Integer id){
		Product prod=service.deleteProduct(id);
		return new ResponseEntity<Product>(prod,HttpStatus.OK);		
	}
	@PutMapping("/update")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product, Integer id){
		Product prod=service.updateProduct(product);
		return new ResponseEntity<Product>(prod,HttpStatus.OK);
		
	}
	

}
