package io.plateer.hmarket.store;

import java.util.List;

import io.plateer.hmarket.entity.Member;

public interface MemberStore {
	
	public void create(Member member);
    public Member retrieve(String memberId);
    public List<Member> retrieveByName(String name);
    public void update(Member member);
    public void delete(String memberId);

    public boolean exists(String memberId);
}
