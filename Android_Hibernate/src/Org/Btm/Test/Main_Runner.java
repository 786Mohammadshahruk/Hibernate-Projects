package Org.Btm.Test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main_Runner 
{
	public static void main(String[] args) 
	{
		//1st step is configure the app
		
		Configuration cfg=new Configuration();
		cfg.configure();
		
		//2ns step
		//make a connection
		SessionFactory factory=cfg.buildSessionFactory();
		//3rd step
		//create session and do CURD Operation
		 Session  session =factory.openSession();
		 
		 Transaction transaction = session.beginTransaction();
		 
		 Android_Demo2 andro1= new Android_Demo2();
		 
		andro1.setAndroid_Name("jellybean");
		andro1.setFacChar("lolypop");
		
		Android_Demo2 andro2= new Android_Demo2();
		 
		andro2.setAndroid_Name("marshmello");
		andro2.setFacChar("jellybean");
		
		Android_Demo2 andro3= new Android_Demo2();
		 
		andro3.setAndroid_Name("icecreem");
		andro3.setFacChar("jellybean 4.0");
		session.save(andro1);
		session.save(andro2);
		session.save(andro3);
		transaction.commit();
		
	}

}
