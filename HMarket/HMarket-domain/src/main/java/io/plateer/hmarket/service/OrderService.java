package io.plateer.hmarket.service;

import java.util.List;

import io.plateer.hmarket.entity.Order;

public interface OrderService {

	public void register(Order order);
	public Order find(String orderId);
    public List<Order> findByMemberId(String memberId);
    public List<Order> findByMemberIdAndState(String memberId, String state);
    public void modify(Order order);
    public void remove(String orderId);
}
