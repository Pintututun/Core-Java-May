package static_package_may30;

public class Test20 {
	static int x =100;
	static {
		x = 200;
		System.out.println("SB X : "+x);
		m1();
	}
	static void m1() {
		x = 300;
		System.out.println("m1 X :"+x);
	}
	public static void main(String []args) {
		System.out.println("main X :"+x);
	}
}
