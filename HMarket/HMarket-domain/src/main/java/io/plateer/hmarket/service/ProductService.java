package io.plateer.hmarket.service;

import java.util.List;

import io.plateer.hmarket.entity.Product;

public interface ProductService {

	public void register(Product product);
	public Product find(String productId);
    public List<Product> findByName(String productName);
    public List<Product> findByCategorie(String categories);
    public List<Product> findByNameAndCategorie(String productName, String categories);
    public List<Product> findByMemberId(String memberId);
    public void modify(Product product);
    public void remove(String productId);
	
}
