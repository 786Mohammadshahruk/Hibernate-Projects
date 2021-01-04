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
@Table(name="tbl_Product")
public class ProductDto implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int id;
	
	
	private String name;
	@Column(name="stu_name")
	private int age;
	
	
	
	
	
	

}
