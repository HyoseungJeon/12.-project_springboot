package io.plateer.hmarket.store.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import io.plateer.hmarket.entity.Member;

@Mapper
public interface MemberMapper {
	
	public void create(Member member);
    public Member retrieve(String memberId);
    public List<Member> retrieveByName(String name);
    public void update(Member member);
    public void delete(String memberId);

    public boolean exists(String memberId);
}
