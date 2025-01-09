package com.xyz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Updatedata {
	public static void main(String[] args) {
		Configuration Cfg = new Configuration();
		Cfg.configure();
		Cfg.addAnnotatedClass(employees.class);
		SessionFactory sf = Cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		String hqlQuery =("update employees Set Name=:myname Where empid=:myid");
		Query<employees> query =ss.createQuery(hqlQuery);
		
		query.setParameter("myname", "Gauri");
		query.setParameter("myid", 1);
		query.executeUpdate();
		System.out.println("data is updated....");
		tr.commit();
		ss.close();
	}

}
