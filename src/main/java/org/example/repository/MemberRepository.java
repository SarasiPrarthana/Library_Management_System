package org.example.repository;

import org.example.config.HibernateUtil;
import org.example.model.Member;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import java.util.List;

public class MemberRepository {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    Session session = sessionFactory.openSession();

    Transaction transaction = session.beginTransaction();

    public void addMember(Member member){
        session.persist(member);
        transaction.commit();
    }

    public Member getMember(String id) {
        return session.find(Member.class,id);
    }

    public void deleteMember(String id) {
        session.remove(session.find(Member.class,id));
        transaction.commit();
    }

    public void updateMember(Member member) {
        session.merge(member);
        transaction.commit();
    }

    public List<Member> getAll() {
        List<Member> memberList = session.createQuery("FROM Member", Member.class).list();
        return memberList;
    }
}
