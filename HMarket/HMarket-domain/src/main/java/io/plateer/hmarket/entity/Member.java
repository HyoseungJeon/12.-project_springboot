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
public class Member {

	private String member_id;
	private String name;
	private String password;
	private String email;
	private String join_date;
	private String address;
	private String auth;
}
