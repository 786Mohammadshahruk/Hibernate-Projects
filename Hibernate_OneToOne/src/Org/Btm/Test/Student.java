package Org.Btm.Test;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int roll;
	private String name;
	private int age;
	
	@Embedded
	private Addres addres;
	
	
	
	public Addres getAddres() {
		return addres;
	}
	public void setAddres(Addres addres) {
		this.addres = addres;
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
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	

}
