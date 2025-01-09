package com.xyz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteData {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(employees.class);
		SessionFactory sf =cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		
		String hqlQuery = ("Delete employees WHERE empid=:myid");
		int empid=1;
		Query<employees> query =ss.createQuery(hqlQuery);
		query.setParameter("myid", 2);
		query.executeUpdate();
		System.out.println("data is deleted...");
		tr.commit();
		ss.close();
		
		
		
	}

}
