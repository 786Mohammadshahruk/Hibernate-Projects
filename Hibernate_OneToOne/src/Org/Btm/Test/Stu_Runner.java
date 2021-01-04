package Org.Btm.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Stu_Runner 
{
	public static void main(String[] args) 
	{
		SessionFactory sf= Hibernate_util.getSessionFactory();
		
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		
		Addres ramadd=new Addres();
		ramadd.setState("Jharkhand");
		ramadd.setCity("JamshedPur");
		ramadd.setPincode(833201);
		
		Student ram=new Student();
		ram.setName("ram");
		ram.setAge(20);
		ram.setRoll(200);
		ram.setAddres(ramadd);
		session.save(ram);
		
		
		tx.commit();
	}

}
