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
		
		Teacher shi = new Teacher();
		shi.setTeachername("Shishra");

		Teacher viv = new Teacher();
		viv.setTeachername("Vivek");

		Teacher ksh = new Teacher();
		ksh.setTeachername("kshitij");

		Student nv=new Student();
		nv.setStudentName("Navdeep");
		
		Student pa=new Student();
		pa.setStudentName("paritosh");
		
		Student rs=new Student();
		rs.setStudentName("rashmita");
		
		Student pw=new Student();
		pw.setStudentName("pawan");

		// define relationship here teacher prespective
		shi.getStudent().add(nv);
		shi.getStudent().add(pa);
		viv.getStudent().add(rs);
		ksh.getStudent().add(nv);
		ksh.getStudent().add(pa);
		ksh.getStudent().add(rs);
		ksh.getStudent().add(pw);

		
		//define relationship student prespective
		
		nv.getTeacher().add(shi);
		pa.getTeacher().add(shi);
		rs.getTeacher().add(viv);
		nv.getTeacher().add(ksh);
		pa.getTeacher().add(ksh);
		rs.getTeacher().add(ksh);
		pw.getTeacher().add(ksh);

		session.save(shi);
		session.save(viv);
		session.save(ksh);
		session.save(nv);
		session.save(pa);		
		session.save(rs);		
		session.save(pw);		

		tx.commit();

	}

}
