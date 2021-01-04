package Strudent;

import java.io.Serializable;

import javax.persistence.*;
@Entity
public class Student implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String Name;
	private String Branch;
	@OneToOne
	private Laptop laptop;
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getBranch() {
		return Branch;
	}
	public void setBranch(String branch) {
		Branch = branch;
	}
	public Student() 
	{
	}

}
