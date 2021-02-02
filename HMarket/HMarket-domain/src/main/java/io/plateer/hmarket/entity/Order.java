package io.plateer.hmarket.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
	private String order_id;
	private String product_id;
	private String member_id;
	private int count;
	private String state;
	private String address;
	private String order_Date;
}
