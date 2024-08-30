package static_package_may30;

public class Test24 {
	static int a = 20;
	static {
		System.out.println("SB1 : "+Test24.a);
		System.out.println("SB1 : "+a);
	}
	static {
		System.out.println("SB2 : "+Test24.b);
	}	
	static int b = 30;
	public static void main(String[] args) {
		System.out.println("A : "+a);
		System.out.println("B : "+b);
	}
}
