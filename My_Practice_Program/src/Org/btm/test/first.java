package Org.btm.test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class first implements Serializable 
{
	@Id
	private int x;
	private String name;
	private String branch;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public first() 
	{
	}
	
}
