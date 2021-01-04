package Org.Btm.Test;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class BG_Runner 
{
	public static void main(String[] args) 
	{
		SessionFactory sf = Hibernate_util.getSessionFactory();

		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();

		List<Home> listforRam = new ArrayList<Home>();
		List<Home> listforsham = new ArrayList<Home>();
		Person ram = new Person();
		ram.setName("ram");

		Person sham = new Person();
		sham.setName("syam");

		Home ramHome1 = new Home();
		ramHome1.setName("ram nivas");
		ramHome1.setType("2bhk");

		Home ramHome2 = new Home();
		ramHome2.setName("ram villa");
		ramHome2.setType("7Bhk");

		Home shamHome1 = new Home();
		ramHome1.setName("sam nivas");
		ramHome1.setType("2Bhk");

		Home shamHome2 = new Home();
		ramHome1.setName("sam villa");
		ramHome1.setType("7Bhk");

		// add home to sam list

		listforsham.add(shamHome1);

		// define relationship here

		ram.setHomes(listforRam);
		sham.setHomes(listforsham);
		ramHome1.setPerson(ram);
		ramHome2.setPerson(ram);
		shamHome1.setPerson(sham);

		session.save(ram);
		session.save(sham);
		session.save(ramHome1);
		session.save(ramHome2);
		session.save(shamHome1);

		tx.commit();

	}

}
