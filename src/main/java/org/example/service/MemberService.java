package org.example.service;

import org.example.model.Member;
import org.example.repository.MemberRepository;

public class MemberService {

    MemberRepository memberRepository = new MemberRepository();

    public void add(Member member){
        memberRepository.addMember(member);
    }
}
