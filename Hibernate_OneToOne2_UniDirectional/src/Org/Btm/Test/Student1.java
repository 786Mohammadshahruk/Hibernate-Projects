package Org.Btm.Test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student1 implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	String id;
	String name;
		
	public Girl1 getG1() {
		return g1;
	}


	public void setG1(Girl1 g1) {
		this.g1 = g1;
	}


	@OneToOne
	Girl1 g1;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	

}
