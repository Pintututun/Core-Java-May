package lambda_program_may23;

interface I1
{
	default void m1()
	{
		System.out.println("Default method of I1 interface...");
	}
}
interface I2
{
	default void m1()
	{
		System.out.println("Default method of I2 Interface...");
	}
}
class MyClass implements I1,I2
{
   @Override
   public void m1()
	{
	   System.out.println("m1 method of MyClass");
		I1.super.m1();
		I2.super.m1();
	}
}
class MultipleInheritance 
{
	public static void main(String[] args) 
	{
		MyClass m = new MyClass();
		m.m1();
	}
}
