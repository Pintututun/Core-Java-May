package saturdayTest;

class NI
{
	void nit()
	{
		System.out.print("Welcome");
	}
}

class NI1 extends NI
{
	void nit() 
	{
		System.out.print(" NareshIT");
	}
}
public class OpsMCQ {
	static void print(NI n)
	{
		n.nit();
	}
	
	public static void main(String[] args) {
		NI nit1 = new NI();
		NI1 nit2 = new NI1();
		NI nit3 = new NI1();
		
		print(nit1);
		print(nit2);
		print(nit3);
		
	}
}
