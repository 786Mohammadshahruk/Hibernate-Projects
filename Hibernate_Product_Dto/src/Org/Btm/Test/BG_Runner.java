package Org.Btm.Test;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BG_Runner 
{
	public static void main(String[] args) 
	{
		SessionFactory sf = Hibernate_util.getSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		//dummy data for hql
		session.save(new Student("Ram",21));
		session.save(new Student("syam",22));
		session.save(new Student("raju",23));
		session.save(new Student("rake",24));
	
		tx.commit();
		
	}

}
