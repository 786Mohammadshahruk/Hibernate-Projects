package Org.Btm.Test;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;
@Entity
public class Student implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int studentId;
	String studentName;
	
	@ManyToMany
	List<Teacher> teacher=new ArrayList<Teacher>();
	public List<Teacher> getTeacher() {
		return teacher;
	}
	public void setTeacher(List<Teacher> teacher) {
		this.teacher = teacher;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Student() {
	}
	
	
}
