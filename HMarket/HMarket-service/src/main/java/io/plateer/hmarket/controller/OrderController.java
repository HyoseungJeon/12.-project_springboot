package io.plateer.hmarket.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.plateer.hmarket.entity.Order;
import io.plateer.hmarket.service.OrderService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/order")
public class OrderController {
	private final OrderService orderService;
	
	@PostMapping("/register")
	public void register(@RequestBody Order order) {
		orderService.register(order);
	};
	
	@GetMapping("/find")
	public Order find(@RequestParam String orderId) {
		return orderService.find(orderId);
	};
	
	@GetMapping("/find-by-memberid")
    public List<Order> findByMemberId(@RequestParam String memberId){
		return orderService.findByMemberId(memberId);
	};
	
	@GetMapping("/find-by-memberid-and-state")
    public List<Order> findByMemberIdAndState(@RequestParam String memberId, @RequestParam String state){
    	return orderService.findByMemberIdAndState(memberId, state);
    };
    
    @PutMapping("/update")
    public void modify(@RequestBody Order order) {
    	orderService.modify(order);
    };
    
    @DeleteMapping("/remove")
    public void remove(String orderId) {
    	orderService.remove(orderId);
    };
}
