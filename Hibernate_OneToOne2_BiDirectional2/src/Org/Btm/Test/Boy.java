package Org.Btm.Test;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Boy implements Serializable
{
	
	@Override
	public String toString() {
		return "Boy [BoyId=" + BoyId + ", name=" + name + ", age=" + age + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int BoyId; 
	private String name;
	private int age;
	
	@OneToOne
	Girl1 girl;
	
	
	public Girl1 getGirl() {
		return girl;
	}
	public void setGirl(Girl1 girl) {
		this.girl = girl;
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
	public int getBoyId() {
		return BoyId;
	}
	public void setBoyId(int boyId) {
		BoyId = boyId;
	}
	
	
	

}
