package static_package_may30;

public class Example9 {
	public static void main(String[] args) {
		System.out.println("Main Method Starts....");
		Example9.m1();
		System.out.println("Main Method Ends....");
	}
	static  void m1() {
		System.out.println("User Defined Method...");
	}
	static {
		System.out.println("Static Block Starts...");
		Example9.m1();
		System.out.println("Static Block Ends...");
	}
}
