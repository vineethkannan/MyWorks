package com.diviso.producerApp;

import org.springframework.data.domain.Page;

public interface ProductService {
	
	public void saveProduct(Product product);

	public void getProductById(Long id);

	public Page<Product> getProductsByName(String productName, Integer pageno);

	public Page<Product> getAllProducts(Integer pageno);

	public void deleteProduct(Long id);

	public Page<Product> getProductsByHighCost(Integer pageno);

	public Product getProductByBarCode(Long barCode);

}
