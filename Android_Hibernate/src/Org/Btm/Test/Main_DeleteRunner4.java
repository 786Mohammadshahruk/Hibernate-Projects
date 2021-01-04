package Org.Btm.Test;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.sql.Update;


public class Main_DeleteRunner4 
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
		 
		 //fetch object or select		 
		 Android_Demo2 adro1=session.get(Android_Demo2.class, 11);
		 System.out.println(adro1);
		 
		 Transaction tran=session.beginTransaction();
		 adro1.setAndroid_Name("shahruk");
		 adro1.setFacChar("AAA");
		 session.delete(adro1);
		 tran.commit();
		
	}

	

}
