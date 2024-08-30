package saturdayTest;

class NITT
{
	protected int a, b;
	public NITT(int a1, int b1) 
	{
		a = a1;
		b = b1;
	}
	public NITT() {
		
	}
}
public class OopssMCQ {

	public static void main(String[] args) {
		NITT nit = new NITT();
		System.out.println(nit.a+" "+nit.b);
	}
}
