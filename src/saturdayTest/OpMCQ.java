package saturdayTest;

class IT
{
	void nit()
	{
		System.out.print("Welcome");
	}
}

class IT1 extends IT
{
	void nit() 
	{
		System.out.print(" NareshIT");
	}
}
public class OpMCQ {
	static void print(IT1 n)
	{
		n.nit();
	}
	
	public static void main(String[] args) {
		IT nit1 = new IT();
		IT1 nit2 = new IT1();
		IT nit3 = new IT1();
		//print(nit1);
		print(nit2);
		//print(nit3);
		
	}
}
