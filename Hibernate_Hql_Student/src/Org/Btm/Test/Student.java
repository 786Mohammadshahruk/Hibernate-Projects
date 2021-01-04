package Org.Btm.Test;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Student")
public class Student implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int roll;
	private String name;
	@Column(name="stu_name")
	private int age;
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", age=" + age + "]\n";
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Student() {
	}
	
	
	
	

}
