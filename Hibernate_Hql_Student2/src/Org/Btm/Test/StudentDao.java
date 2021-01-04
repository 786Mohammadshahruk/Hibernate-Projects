package Org.Btm.Test;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class StudentDao 
{
	SessionFactory sf=Hibernate_util.getSessionFactory();
	Student findStudentByRollNo(int rollNo)
	{
		Student student=null;
		
		Session session=sf.openSession();
	    Query query=session.createQuery("from Student where roll=:rl");
	    query.setParameter("rl", rollNo);
	    
	    student =(Student)query.uniqueResult();
	    session.close();
		
		return student;
	}
	

}
