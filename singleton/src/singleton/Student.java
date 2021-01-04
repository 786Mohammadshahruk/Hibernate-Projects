package singleton;

public class Student 
{
	public String toString() {
		return "Student [name=" + name + "]";
	}
	String name;
	private static Student student;
	
	static
	{
		student =new Student();
	}
	public static Student getStudent()
	{
		return student;
	}
	private Student()
	{
		
	}

}
