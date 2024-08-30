package saturdayTest;

class NIITTT
{
	public NIITTT() 
	{
		System.out.print("NIT ");
	}
}

class NIIIT1 extends NIITTT
{
	public NIIIT1() {
		System.out.print("NIT1 ");
	}
}

class NIT2 extends NIIIT1
{
	public NIT2() {
		System.out.print("NIT2");
	}
}

public class Ops {
	public static void main(String[] args) {
		NIT2 nit = new NIT2();
	}
}
