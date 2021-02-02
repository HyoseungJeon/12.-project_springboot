package io.plateer.hmarket.store;

import java.util.List;

import org.springframework.stereotype.Repository;

import io.plateer.hmarket.entity.Member;
import io.plateer.hmarket.store.mapper.MemberMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Repository
public class MemberMariaStore implements MemberStore{

	private final MemberMapper memberMapper;
	
	@Override
	public void create(Member member) {
		// TODO Auto-generated method stub
		memberMapper.create(member);
	}

	@Override
	public Member retrieve(String memberId) {
		// TODO Auto-generated method stub
		return memberMapper.retrieve(memberId);
	}

	@Override
	public List<Member> retrieveByName(String name) {
		// TODO Auto-generated method stub
		return memberMapper.retrieveByName(name);
	}

	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		memberMapper.update(member);
	}

	@Override
	public void delete(String memberId) {
		// TODO Auto-generated method stub
		memberMapper.delete(memberId);
	}

	@Override
	public boolean exists(String memberId) {
		// TODO Auto-generated method stub
		return memberMapper.retrieve(memberId) != null ? true : false;
	}

}
