package org.example.repository;

import org.example.config.HibernateUtil;
import org.example.model.Member;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class MemberRepository {

    SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

    Session session = sessionFactory.openSession();

    Transaction transaction = session.beginTransaction();

    public void addMember(Member member){
        session.persist(member);
        transaction.commit();
    }
}
