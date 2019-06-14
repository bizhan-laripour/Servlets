package crud.dao;

import crud.entity.Member;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class MemberService {


    public Member save(Member member) {
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(member);
        transaction.commit();
        session.close();
        sessionFactory.close();
        return member;
    }


    public void delete(Member member) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.delete(member);
        transaction.commit();
        session.close();
        sessionFactory.close();
    }


    public List<Member> findAll() {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createQuery("from Member");
        List<Member> members = query.list();
        transaction.commit();
        session.close();
        sessionFactory.close();
        return members;
    }


    public Member update(Member member) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(member);

        transaction.commit();
        session.close();
        sessionFactory.close();
        return member;
    }
}
