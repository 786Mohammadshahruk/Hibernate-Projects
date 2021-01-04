package Org.Btm.Test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class Featch_Runner
{
	public static void main(String[] args) {
		SessionFactory sf=Hibernate_util.getSessionFactory();
		Session session=sf.openSession();
		
		Query<Student> query= session.createQuery("from Student where roll=2");
		//Using placed Holder home Work
		//query.setString(1, "ram");
		List<Student> list=query.list();
		System.out.println(list);
	}

}
