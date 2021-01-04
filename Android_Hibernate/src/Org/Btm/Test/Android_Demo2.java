package Org.Btm.Test;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GeneratorType;


@Entity
public class Android_Demo2 
{
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int Android_Id;
	
	private String Android_Name;
	private String facChar;
	public int getAndroid_Id() {
		return Android_Id;
	}
	public void setAndroid_Id(int android_Id) {
		Android_Id = android_Id;
	}
	public String getAndroid_Name() {
		return Android_Name;
	}
	public void setAndroid_Name(String android_Name) {
		Android_Name = android_Name;
	}
	public String getFacChar() {
		return facChar;
	}
	public void setFacChar(String facChar) {
		this.facChar = facChar;
	}
	@Override
	public String toString() {
		return "Android_Demo2 [Android_Id=" + Android_Id + ", Android_Name=" + Android_Name + ", facChar=" + facChar
				+ "]";
	}
	
	

}
