package Org.Btm.Test;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Hibernate_util
{
	//1st
	private static SessionFactory factory;
	
	//2nd
	static 
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		
		factory=cfg.buildSessionFactory();
		System.out.println("Session fectory is created");
	}
	// 3rd
	public static SessionFactory getSessionFactory()
	{
		return factory;
	}
	private Hibernate_util()
	{
		
	}

}
