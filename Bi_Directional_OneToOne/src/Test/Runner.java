package Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Runner 
{
	public static void main(String[] args) 
	{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Woman woman=new Woman();
		woman.setAge(20);
		woman.setName("ritu");
		
		Man man=new Man();
		man.setAge(21);
		man.setName("Raj");
		
		man.setWoman(woman);
		
		session.save(man);
		session.save(woman);
		tx.commit();		
		
	}

}
