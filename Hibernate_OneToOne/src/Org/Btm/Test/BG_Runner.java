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
	Transaction tx=session.beginTransaction();
	
	Student1 stu=new Student1();
	stu.setName("raj");
	stu.setId(20);
	
	Girl1 g1=new Girl1();
	g1.setid(10);
	g1.setName("munni");
	
	
	}

}
