package org.btm.Hdemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class F_H_Runner 
{
	public static void main(String[] args) 
	{
		Configuration conf=new Configuration();
		conf.configure();
		System.out.println("Configured");
		SessionFactory sf=conf.buildSessionFactory();
		System.out.println("Session fectory is created");
		Session session=sf.openSession();
		System.out.println("Session created");
		Transaction tran=session.beginTransaction();
		
		
	}

}
