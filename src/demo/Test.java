package demo;

class Input
{
	public void accept(String b)
	{
		System.out.println("String is invoked..");
	}
	public void accept(Object b)
	{
		System.out.println("Object is invoked..");
	}

}
public class Test
{
	public static void main(String [] india)
	{
		Input i = new Input();
		i.accept("NIT");
		i.accept(null);
	}
}


