package static_package_may30;

public class Example7 {
	public static void main(String[] args) {
	System.out.println("Main Method....");
	}
	static  void fun() {
	System.out.println("User Defined Method...");
	}
	static
	{
		fun();
	}
}
