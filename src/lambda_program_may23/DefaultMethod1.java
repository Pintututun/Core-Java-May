package lambda_program_may23;

interface I
{
	default void demo()
	{
		System.out.println("Demo Method in interface I1");
	}
}

class A
{
	public void demo()
	{
		System.out.println("Demo Method in class A");
		
	}
}

class B extends A implements I
{	
	public void demo()
	{
		I.super.demo();
	}
}

public class DefaultMethod1 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.demo();
	}
}
