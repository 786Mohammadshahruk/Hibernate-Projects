package Org.Btm.Test;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Girl1 implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int Gid;
	String name;
	
	@OneToOne(mappedBy = "girl")
	Boy boy;
	
	@Override
	public String toString() {
		return "Girl1 [Gid=" + Gid + ", name=" + name + "]";
	}
	public Boy getBoy() {
		return boy;
	}
	public void setBoy(Boy boy) {
		this.boy = boy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getGid() {
		return Gid;
	}
	public void setGid(int gid) {
		Gid = gid;
	}

}
