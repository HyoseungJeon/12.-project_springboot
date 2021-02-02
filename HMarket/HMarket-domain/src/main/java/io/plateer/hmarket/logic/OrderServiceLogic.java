package io.plateer.hmarket.logic;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.plateer.hmarket.entity.Order;
import io.plateer.hmarket.entity.Product;
import io.plateer.hmarket.service.OrderService;
import io.plateer.hmarket.store.MemberStore;
import io.plateer.hmarket.store.OrderStore;
import io.plateer.hmarket.store.ProductStore;
import io.plateer.hmarket.util.CantUpdateQuantityException;
import io.plateer.hmarket.util.InvalidNameException;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class OrderServiceLogic implements OrderService{
	private final OrderStore orderStore;
	private final ProductStore productStore;
	
	@Override
	public void register(Order order) {
		// TODO Auto-generated method stub
		Product product = productStore.retrieve(order.getProduct_id());
		if(product.getQuantity() < order.getCount()) {
			throw new CantUpdateQuantityException("Out of stock.");
		}
		product.setQuantity(product.getQuantity() - order.getCount());
		productStore.update(product);
		
		orderStore.create(order);
	}

	@Override
	public Order find(String orderId) {
		// TODO Auto-generated method stub
		return orderStore.retrieve(orderId);
	}

	@Override
	public List<Order> findByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return orderStore.retrieveByMemberId(memberId);
	}

	@Override
	public List<Order> findByMemberIdAndState(String memberId, String state) {
		// TODO Auto-generated method stub
		return orderStore.retrieveByState(memberId, state);
	}

	@Override
	public void modify(Order order) {
		// TODO Auto-generated method stub
		Product product = productStore.retrieve(order.getProduct_id());
		if(product.getQuantity() < order.getCount()) {
			throw new CantUpdateQuantityException("Out of stock.");
		}
		product.setQuantity(product.getQuantity() - order.getCount());
		
		productStore.update(product);
		orderStore.update(order);
	}

	@Override
	public void remove(String orderId) {
		// TODO Auto-generated method stub
		orderStore.delete(orderId);
	}

}
