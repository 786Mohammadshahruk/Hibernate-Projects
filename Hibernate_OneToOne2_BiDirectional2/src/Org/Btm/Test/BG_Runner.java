package Org.Btm.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BG_Runner 
{
	public static void main(String[] args) 
	{
	SessionFactory sf= Hibernate_util.getSessionFactory();
	
	
	Session session=sf.openSession();
	
	Boy b1=session.get(Boy.class, 1);
	System.err.println(b1);
	Girl1 g1=session.get(Girl1.class, 2);
	System.err.println(g1);
	/*Transaction tran=session.beginTransaction();
	
	Boy b=new Boy();
	b.setBoyId(1);
	b.setName("Raj");
	b.setAge(21);
	
	
	Girl1 g=new Girl1();
	g.setName("simran");
	g.setGid(11);
	session.save(b);
	session.save(g);
	b.setGirl(g);
	g.setBoy(b);
	tran.commit();*/
	
	
	
	
	
	
	}

}
