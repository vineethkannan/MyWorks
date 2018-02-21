package com.diviso.producerApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RequestMapping("/product")
@RestController
public class ProductController {
	
	@Autowired private ProductService service; 
	
	@RequestMapping(value="/save",method=RequestMethod.GET)
	public void saveProduct(Product product){
		
		service.saveProduct(product);
		
	}
	
	@RequestMapping("/read/productById/{id}")
	public void findProductById(@PathVariable Long id){
		
		service.getProductById(id);
		
	}
	
	@RequestMapping("/read/productByBarCode/{barCode}")
	public Product findProductBybarCode(@PathVariable Long barCode ){
		
		return service.getProductByBarCode(barCode);
		
	}
	
	@RequestMapping("/read/products/{pageno}")
	public Page<Product> findAllProducts(@PathVariable Integer pageno){
		
		return service.getAllProducts(pageno);
	}
	
	@RequestMapping("/read/productByName/{productName}/{pageno}")
	public Page<Product> findProductByName(@PathVariable String productName,@PathVariable  Integer pageno){
		
		return service.getProductsByName(productName,pageno);
		
	}
	
	@RequestMapping("/read/productByHighCost/{pageno}")
	public Page<Product> findProductsByHighCost(@PathVariable Integer pageno){
		
		return service.getProductsByHighCost(pageno);
	}
	
	@RequestMapping(value="/update",method=RequestMethod.PUT)
	public void updateProduct(Product product){
		
		service.saveProduct(product);
	}
	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public void deleteProduct(@PathVariable Long id){
		
		service.deleteProduct(id);
		
	}
	
	
	
	

}
