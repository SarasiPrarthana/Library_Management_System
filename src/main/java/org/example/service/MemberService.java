package org.example.service;

import org.example.model.Member;
import org.example.repository.MemberRepository;

import java.util.List;

public class MemberService {

    MemberRepository memberRepository = new MemberRepository();

    public void addMember(Member member){
        memberRepository.addMember(member);
    }

    public Member getMember(String id) {
        return memberRepository.getMember(id);
    }

    public void deleteMember(String id) {
        memberRepository.deleteMember(id);
    }

    public void updateMember(Member member) {
        memberRepository.updateMember(member);
    }

    public List<Member> getAll() {
        return memberRepository.getAll();
    }
}
