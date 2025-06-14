package com.product.Exception;

public class ProductNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L; 
	
	public ProductNotFoundException(String msg) {
		
		super(msg);
		
	}
	
	 public ProductNotFoundException(String message, Throwable cause) {
	        super(message, cause);
	    }
	

}
