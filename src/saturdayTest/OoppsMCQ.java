package saturdayTest;

class NIIT
{
	protected int a, b;
	public NIIT(int a1, int b1) 
	{
		a = a1;
		b = b1;
	}
}
public class OoppsMCQ  {

	public static void main(String[] args) {
		NIIT nit = new NIIT(4,6);
		System.out.println(nit.a+" "+nit.b);
	}
}
