package Org.Btm.Test;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.*;
@Entity
public class Teacher implements Serializable
{	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int TeacherId; 
	private String Teachername;
	//cascading
	@ManyToMany(cascade = CascadeType.ALL)
	//@ManyToMany
	
	//egar
	List<Student> student=new ArrayList<Student>();
	
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	//List<Student> student;
	public int getTeacherId() {
		return TeacherId;
	}
	public void setTeacherId(int teacherId) {
		TeacherId = teacherId;
	}
	public String getTeachername() {
		return Teachername;
	}
	public void setTeachername(String teachername) {
		Teachername = teachername;
	}
	public Teacher() {
	}
	
	
	
	
	
	

}
