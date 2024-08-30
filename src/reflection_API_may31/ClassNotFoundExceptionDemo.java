package reflection_API_may31;

class Foo
{
	static
	{
		System.out.println("static block gets executed...");
	}
}
class ClassNotFoundExceptionDemo 
{
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class.forName("reflection_API_may31.Foo"); 
	}
}
