package reflection_API_may31;

class Student
{
  static
  {
	  System.out.println("Static block of student class");
  }
}

public class Test 
{	
	public static void main(String[] args) throws ClassNotFoundException 
	{
	  Class.forName("reflection_API_may31.Student");
	}

}
