package io.plateer.hmarket.service;

import java.util.List;

import io.plateer.hmarket.entity.Member;

public interface MemberService {

	public void register(Member member);
    public Member find(String memberId);
    public List<Member> findByName(String name);
    public void modify(Member member);
    public void remove(String memberId);
}
