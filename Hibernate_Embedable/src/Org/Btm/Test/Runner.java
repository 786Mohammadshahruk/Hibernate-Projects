package Org.Btm.Test;

import org.hibernate.SessionFactory;

public class Runner 
{
	public static void main(String[] args) 
	{
		SessionFactory sing1=Hibernate_util.getSessionFactory();
		System.out.println("-----------------------");
		SessionFactory sing2=Hibernate_util.getSessionFactory();
		System.out.println(sing1==sing2);
		
	}

}
