package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Runner 
{
	public static void main(String[] args) 
	{
		Configuration conf=new Configuration();
		conf.configure();
		SessionFactory fect=conf.buildSessionFactory();
		Session session=fect.openSession();
		Transaction tran=session.beginTransaction();
		First f=new First();
		f.setId(1);
		f.setName("Shahruk");
		f.setPerc(71);
		session.save(f);
		tran.commit();
		
	}

}
