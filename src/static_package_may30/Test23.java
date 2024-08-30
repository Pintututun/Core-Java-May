package static_package_may30;

public class Test23 {
	static {
		//System.out.println("SB1 X :"+x);
		System.out.println("SB1 X : "+Test23.x);
	}
	static int x = 10;
	static {
		x = 20;
		System.out.println("SB2 X : "+Test23.x);
	}
	public static void main(String[] args) {
		//no-operation
	}
}
