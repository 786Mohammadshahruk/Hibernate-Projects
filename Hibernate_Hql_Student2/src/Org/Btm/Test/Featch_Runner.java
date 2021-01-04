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
		
		/*//Using placed Holder 
		Query<StudentDao> query= session.createQuery("from tbl_StudentDao where age=?");
		query.setParameter(1, 21);
		List<StudentDao> list=query.list();
		System.out.println(list);
		
		//or
		/*Query<StudentDao> newquery= session.createQuery("from StudentDeo where age=:age");
		newquery.setParameter("a", arg1)
		List<StudentDao> list2=newquery.list();
		System.out.println(list2);*/
		
		StudentDao studentDao=new StudentDao();
		Student student=studentDao.findStudentByRollNo(1);
		System.out.println(student);
	}

}
