package static_package_may30;

public class Example8 {
	public static void main(String[] args) {
		System.out.println("Main Method Starts....");
		Example8.fun();
		System.out.println("Main Method Ends....");
	}
	static  void fun() {
		System.out.println("User Defined Method...");
	}
}
