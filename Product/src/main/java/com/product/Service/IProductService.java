package com.product.Service;

import java.util.List;

import com.product.entity.Product;

public interface IProductService {

	 Product addProduct(Product product);
	 Product getProductById(Integer id);
	 List<Product> getAllProducts();
	 Product deleteProduct(Integer id);
	 Product updateProduct(Product product);
}
