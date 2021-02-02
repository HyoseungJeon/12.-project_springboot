package io.plateer.hmarket.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	private String product_id;
	private String member_id;
	private String product_name;
	private String product_intro;
	private String categories;
	private int quantity;
	private int price;
	private String upload_date;
}
