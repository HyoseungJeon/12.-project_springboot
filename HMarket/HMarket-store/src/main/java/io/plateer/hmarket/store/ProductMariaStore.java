package io.plateer.hmarket.store;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.plateer.hmarket.entity.Product;
import io.plateer.hmarket.store.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class ProductMariaStore implements ProductStore{
	
	private final ProductMapper productMapper;
	
	@Override
	public void create(Product product) {
		// TODO Auto-generated method stub
		productMapper.create(product);
	}

	@Override
	public Product retrieve(String product_id) {
		// TODO Auto-generated method stub
		return productMapper.retrieve(product_id);
	}

	@Override
	public List<Product> retrieveByName(String productName) {
		// TODO Auto-generated method stub
		return productMapper.retrieveByName(productName);
	}

	@Override
	public List<Product> retrieveByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return productMapper.retrieveByMemberId(memberId);
	}

	@Override
	public List<Product> retrieveByCategorie(String categories) {
		// TODO Auto-generated method stub
		return productMapper.retrieveByCategorie(categories);
	}

	@Override
	public List<Product> retrieveByNameAndCategorie(String productName, String categories) {
		// TODO Auto-generated method stub
		return productMapper.retrieveByNameAndCategorie(productName, categories);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		productMapper.update(product);
	}

	@Override
	public void delete(String product_id) {
		// TODO Auto-generated method stub
		productMapper.delete(product_id);
	}

	@Override
	public boolean exists(String product_id) {
		// TODO Auto-generated method stub
		return productMapper.retrieve(product_id) != null ? true : false;
	}

}
