package io.plateer.hmarket.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.plateer.hmarket.entity.Product;
import io.plateer.hmarket.service.ProductService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/product")
public class ProductController {
	
	private final ProductService productService;
	
	@PostMapping("/register")
	public void register(Product product) {
		productService.register(product);
	};
	
	@GetMapping("/find")
	public Product find(String productId) {
		return productService.find(productId);
	};
	
	@GetMapping("find-by-name")
    public List<Product> findByName(String productName){
		return productService.findByName(productName);
	};
	
	@GetMapping("find-by-categorie")
    public List<Product> findByCategorie(String categories){
		return productService.findByCategorie(categories);
	};
	
	@GetMapping("find-by-name-catagorie")
    public List<Product> findByNameAndCategorie(String productName, String categories){
		return productService.findByNameAndCategorie(productName, categories);
	};
	
	@GetMapping("find-by-memberid")
    public List<Product> findByMemberId(String memberId){
		return productService.findByMemberId(memberId);
	};
	
	@PutMapping("upadte")
    public void modify(Product product) {
		productService.modify(product);
	};
	
	@DeleteMapping("remove")
    public void remove(String productId) {
		productService.remove(productId);
	};
}
