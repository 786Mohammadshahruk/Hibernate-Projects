package Strudent;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil 
{
	private static SessionFactory factory;
	
	static
	{
		Configuration conf=new Configuration();
		conf.configure();
		factory=conf.buildSessionFactory();
	}
	
	static SessionFactory getSessionFectory()
	{
		return factory;
	}
	public HibernateUtil() 
	{
	}

}
