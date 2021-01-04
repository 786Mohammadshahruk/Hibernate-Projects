package Org.btm.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class runner 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		
		SessionFactory sb=cfg.buildSessionFactory();
		
		Session session = sb.openSession();
		 
		Transaction tran=session.beginTransaction();
		
		
		first f=new first();
		f.setName("Shahruk");
		f.setBranch("ComputerScience");
		session.save(f);
		tran.commit();
	
	}

}
