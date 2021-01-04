package Strudent;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class runner
{
	public static void main(String[] args) 
	{
		SessionFactory sf=HibernateUtil.getSessionFectory();
		Session session = sf.openSession();
		Transaction tx=session.beginTransaction();
		Laptop laptop=new Laptop();
		laptop.setBrand("Hp");
		laptop.setRam(8);
		Student s=new Student();
		s.setName("Raja");
		s.setBranch("Computer science");
		s.setLaptop(laptop);
		session.save(s);
		session.save(laptop);
		tx.commit();
		
	}

}
