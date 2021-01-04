package test;

import java.io.Serializable;

import javax.persistence.*;
@Entity
public class First implements Serializable
{
	@Id
	private int Id;
	private String name;
	private double perc;
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPerc() {
		return perc;
	}
	public void setPerc(double perc) {
		this.perc = perc;
	}
	public First()
	{
		
	}

}
