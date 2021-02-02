package io.plateer.hmarket.store;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.plateer.hmarket.entity.Order;
import io.plateer.hmarket.store.mapper.OrderMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class OrderMariaStore implements OrderStore{

	private final OrderMapper orderMapper;
	@Override
	public void create(Order order) {
		// TODO Auto-generated method stub
		orderMapper.create(order);
	}

	@Override
	public Order retrieve(String orderId) {
		// TODO Auto-generated method stub
		return orderMapper.retrieve(orderId);
	}

	@Override
	public List<Order> retrieveByMemberId(String memberId) {
		// TODO Auto-generated method stub
		return orderMapper.retrieveByMemberId(memberId);
	}

	@Override
	public List<Order> retrieveByState(String memberId, String state) {
		// TODO Auto-generated method stub
		return orderMapper.retrieveByState(memberId, state);
	}

	@Override
	public void update(Order order) {
		// TODO Auto-generated method stub
		orderMapper.update(order);
	}

	@Override
	public void delete(String orderId) {
		// TODO Auto-generated method stub
		orderMapper.delete(orderId);
	}

	@Override
	public boolean exists(String orderId) {
		// TODO Auto-generated method stub
		return orderMapper.retrieve(orderId) != null ? true : false;
	}

}
