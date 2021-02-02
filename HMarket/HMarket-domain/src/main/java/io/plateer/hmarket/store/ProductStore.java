package io.plateer.hmarket.store;

import java.util.List;

import io.plateer.hmarket.entity.Product;

public interface ProductStore {

	public void create(Product product);
    public Product retrieve(String productId);
    public List<Product> retrieveByName(String productName);
    public List<Product> retrieveByMemberId(String memberId);
    public List<Product> retrieveByCategorie(String categories);
    public List<Product> retrieveByNameAndCategorie(String productName, String categories);
    public void update(Product product);
    public void delete(String productId);

    public boolean exists(String productId);
}
