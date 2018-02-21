package com.diviso.producerApp;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

	public <S extends Product> S save(S s);
	
	public Product findOne(Long id);
	
	public Page<Product> findByProductNameContaining(String productName, Pageable pageRequest);
	
	public Page<Product> findAll(Pageable pageRequest);
	
	public void delete(Long id);

	public Product findByBarCode(Long barCode);
	
	
	
	
	
	

}
