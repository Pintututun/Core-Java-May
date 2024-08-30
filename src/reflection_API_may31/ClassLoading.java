package reflection_API_may31;

class Demo
{
	static int x = 10;
	static
	{
		System.out.println("Static Block of Demo class Executed!!! :"+x);
	}
}
class ClassLoading 
{
	public static void main(String[] args) 
	{
	System.out.println("Main method executed");
	Demo d1 = new Demo(); //By Using Constructor
    System.out.println(Demo.x);  //By accessing static data member
	}
}
