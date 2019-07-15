package com.techlabs.candidate.test;


import java.util.Iterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.techlabs.candidate.Candidate;

public class TestCandidate {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		System.out.println(factory.getClass());
		Session session=factory.openSession();
		String query="select name from Candidate";
		Query q=session.createQuery(query);
		Iterator it=q.iterate();
		Transaction tran=session.beginTransaction();
		try {
			Candidate c1=new Candidate("Abhishek",8.36f);
			session.save(c1);
			Candidate c2=new Candidate("Onkar",8.6f);
			session.save(c2);
			System.out.println("hello");
			while(it.hasNext()) {
				System.out.println("hello");
				Candidate c=(Candidate) it.next();
				int id=c.getId();
				String name=c.getName();
				float cgpa=c.getCgpa();
				System.out.println("id is "+id+" "+name);
			}
			tran.commit();
		}
		catch(Exception ex) {
			tran.rollback();
		}
		finally {
			session.close();
		}
	}

}
