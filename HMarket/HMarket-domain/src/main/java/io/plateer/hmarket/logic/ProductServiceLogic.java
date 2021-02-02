package io.plateer.hmarket.logic;

import java.util.List;

import org.springframework.stereotype.Service;

import io.plateer.hmarket.entity.Product;
import io.plateer.hmarket.service.ProductService;
import io.plateer.hmarket.store.MemberStore;
import io.plateer.hmarket.store.ProductStore;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ProductServiceLogic implements ProductService{
	private final MemberStore memberStore;
	private final ProductStore productStore;
	
	
	@Override
	public void register(Product product) {
		// TODO Auto-generated method stub
		productStore.create(product);
	}

	@Override
	public Product find(String productId) {
		// TODO Auto-generated method stub
		return productStore.retrieve(productId);
	}

	@Override
	public List<Product> findByName(String productName) {
		// TODO Auto-generated method stub
		return productStore.retrieveByName(productName);
	}

	@Override
	public List<Product> findByCategorie(String categories) {
		// TODO Auto-generated method stub
		return productStore.retrieveByCategorie(categories);
	}

	@Override
	public List<Product> findByNameAndCategorie(String productName, String categories) {
		// TODO Auto-generated method stub
		return productStore.retrieveByNameAndCategorie(productName, categories);
	}

	@Override
	public List<Product> findByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return productStore.retrieveByMemberId(memberId);
	}

	@Override
	public void modify(Product product) {
		// TODO Auto-generated method stub
		productStore.update(product);
	}

	@Override
	public void remove(String productId) {
		// TODO Auto-generated method stub
		productStore.delete(productId);
	}

}
