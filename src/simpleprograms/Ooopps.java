package simpleprograms;

class NIITT
{
	protected void nit() 
	{
		
	}
}
class NIT1 extends NIITT
{
	protected void nit() //Here public also possible
	{
		System.out.println("HII......");
	}
}

public class Ooopps {
	public static void main(String[] args) {
		NIT1 n = new NIT1();
		n.nit();
	}
}
