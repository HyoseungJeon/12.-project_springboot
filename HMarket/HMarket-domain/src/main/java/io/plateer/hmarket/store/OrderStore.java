package io.plateer.hmarket.store;

import java.util.List;

import io.plateer.hmarket.entity.Order;

public interface OrderStore {

	public void create(Order order);
	public Order retrieve(String orderId);
    public List<Order> retrieveByMemberId(String memberId);
    public List<Order> retrieveByState(String memberId, String state);
    public void update(Order order);
    public void delete(String orderId);

    public boolean exists(String orderId);
}
