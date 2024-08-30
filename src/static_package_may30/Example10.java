package static_package_may30;

public class Example10 {
	static  void m1() {
		System.out.println("Control in m1 method");
	}

	public static void main(String[] args) {
		System.out.println("Main Method Starts....");
		System.out.println("Calling m2 method");
		Example10.m2();
		System.out.println("Control Back to main from m2 method...");
		System.out.println("Main Method Ends....");
	}

	static  void m2() {
		System.out.println("Control in m2 method");
		System.out.println("Calling m1 method");
		Example10.m1();
		System.out.println("Control Back to m2 from m1 method...");
		System.out.println("m2 method ends...");

	}
	
	static {
		System.out.println("Static Block Starts...");
		System.out.println("Calling m1 method");
		Example10.m1();
		System.out.println("Control Back to Static Block from m1");
		System.out.println("Static Block Ends...");
	}
}
