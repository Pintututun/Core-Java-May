package saturdayTest;

class NiT
{
	protected static void nit() 
	{
		System.out.println("NIT");
	}
}

class NiT1 extends NiT
{
	
	protected static void nit() 
	{
		nit();
	}
}

public class Abstract extends NiT1 {
	public static void main(String[] args) {
		nit();
	}
}
