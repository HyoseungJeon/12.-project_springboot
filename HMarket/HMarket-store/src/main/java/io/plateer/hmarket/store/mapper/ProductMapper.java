package io.plateer.hmarket.store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import io.plateer.hmarket.entity.Product;

@Mapper
public interface ProductMapper {

	public void create(Product product);
    public Product retrieve(String product_id);
    public List<Product> retrieveByName(String productName);
    public List<Product> retrieveByMemberId(String memberId);
    public List<Product> retrieveByCategorie(String categories);
    public List<Product> retrieveByNameAndCategorie(String productName, String categories);
    public void update(Product product);
    public void delete(String product_id);

    public boolean exists(String product_id);
}
