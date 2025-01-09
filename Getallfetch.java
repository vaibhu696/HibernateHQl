package com.xyz;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.hibernate.query.Query;

public class Getallfetch {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(employees.class);
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		
		String hqlquery ="from employees";
		Query<employees> query=ss.createQuery(hqlquery);
		List <employees> list = query.list();
		
		for (employees e:list) {
			System.out.println(e);
			
		}
		
		tr.commit();
		ss.close();
		
	}
	

}
