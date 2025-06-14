package com.product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Exception.ProductNotFoundException;
import com.product.entity.Product;
import com.product.repo.ProductRepo;

@Service
public class ProductServiceImpl implements IProductService {
	
	@Autowired
	private ProductRepo repo;

	@Override
	public Product addProduct(Product product) {		
		return repo.save(product);
	}

	@Override
	public Product getProductById(Integer id) {
		return repo.findById(id).orElseThrow(()-> new ProductNotFoundException("Product not found"+id));		
	}

	@Override
	public List<Product> getAllProducts() {
		return repo.findAll();		
	}

	@Override
	public Product deleteProduct(Integer id) {
		Product product=getProductById(id);
		repo.delete(product);
		return product;

	}

	@Override
	public Product updateProduct(Product product) {		
		return repo.save(product);

	}

}
