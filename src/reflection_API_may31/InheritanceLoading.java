package reflection_API_may31;

class A
{
	static
	{
		System.out.println("Static Block of super class A!!");
	}
}
class B extends A 
{
	static
	{
		System.out.println("Static Block of Sub class B!!");
	}
}
class InheritanceLoading 
{
	public static void main(String[] args) 
	{
		 new B();
	}
}

