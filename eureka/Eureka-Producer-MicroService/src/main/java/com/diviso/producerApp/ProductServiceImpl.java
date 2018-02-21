package com.diviso.producerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class ProductServiceImpl implements ProductService{

	
	@Autowired private ProductRepository repository;

	
	public void saveProduct(Product product) {
		
		repository.save(product);
		
	}

	
	public void getProductById(Long id) {
		
		repository.findOne(id);
		
	}
	

	public Product getProductByBarCode(Long barCode) {
		
		return repository.findByBarCode(barCode);
	}



	public Page<Product> getProductsByName(String productName,Integer pageno) {
		
		return repository.findByProductNameContaining(productName,new PageRequest(pageno-1,2,Sort.Direction.ASC,"productName"));
		
	}


	public Page<Product> getAllProducts(Integer pageno) {
		
		return repository.findAll(new PageRequest(pageno-1,2,Sort.Direction.ASC,"productName"));
	}
	
	
	public Page<Product> getProductsByHighCost(Integer pageno) {
		
		return repository.findAll(new PageRequest(pageno-1,2,Sort.Direction.DESC,"price") );
	}

	
	public void deleteProduct(Long id) {
		
		repository.delete(id);
		
	}

	
	
	
	
	
}
