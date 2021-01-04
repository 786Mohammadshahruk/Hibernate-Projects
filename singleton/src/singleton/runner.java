package singleton;

public class runner
{
	public static void main(String[] args) 
	{
		Student s1=Student.getStudent();
		s1.name="AAA";
		Student s2=Student.getStudent();
		s2.name="BBB";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
		
	}

}
