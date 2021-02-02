package io.plateer.hmarket.logic;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import io.plateer.hmarket.entity.Member;
import io.plateer.hmarket.service.MemberService;
import io.plateer.hmarket.store.MemberStore;
import io.plateer.hmarket.util.InvalidNameException;
import io.plateer.hmarket.util.NoResultException;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class MemberServiceLogic implements MemberService{
	private final MemberStore memberStore;
	

	@Override
	public void register(Member member) {
		// TODO Auto-generated method stub
		Optional.ofNullable(memberStore.retrieve(member.getMember_id()))
        .ifPresent(dto -> {
            throw new InvalidNameException(member.getMember_id() + " already exists.");
        });

		memberStore.create(member);
	}

	@Override
	public Member find(String memberId) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(memberStore.retrieve(memberId))
				.orElseThrow(() -> new NoResultException("Can't find MemberId : " + memberId));
	}

	@Override
	public List<Member> findByName(String name) {
		// TODO Auto-generated method stub
		return Optional.ofNullable(memberStore.retrieveByName(name))
				.orElseThrow(() -> new NoResultException("Can't find Members"));
	}

	@Override
	public void modify(Member member) {
		// TODO Auto-generated method stub
		
		memberStore.update(member);
	}

	@Override
	public void remove(String memberId) {
		// TODO Auto-generated method stub
		
		if (!memberStore.exists(memberId)) {
            throw new NoResultException("Can't find MemberId : " + memberId);
        }
		memberStore.delete(memberId);
	}
}
