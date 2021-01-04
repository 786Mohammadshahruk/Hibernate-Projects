package Org.Btm.Test;

import javax.persistence.Embeddable;

@Embeddable
public class Addres 
{
	String city,state;
	int pincode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
	public Addres()
	{
		
	}
	

}
