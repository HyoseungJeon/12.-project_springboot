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

import io.plateer.hmarket.entity.Member;
import io.plateer.hmarket.service.MemberService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/member")
public class MemberController {
	
	private final MemberService memberService;
	
	@PostMapping("/register")
	public void register(@RequestBody Member member) {
		memberService.register(member);
	};
	
	@GetMapping("/find")
    public Member find(@RequestParam String memberId) {
		return memberService.find(memberId);
	};
	
	@GetMapping("/find-by-name")
    public List<Member> findByName(@RequestParam String name){
    	return memberService.findByName(name);
    };
    
    @PutMapping("/update")
    public void modify(@RequestBody Member member) {
    	memberService.modify(member);
    };
    
    @DeleteMapping("/remove")
    public void remove(String memberId) {
    	memberService.remove(memberId);
    };
}
