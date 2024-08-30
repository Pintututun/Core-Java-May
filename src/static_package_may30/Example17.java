package static_package_may30;

public class Example17 {
	static {
		int a = 10;

		System.out.println("Class Level A : "+Example17.a);
		Example17.a = Example17.a+a;
	}

	static int a = 20;

	public static void main(String[] args) {
		System.out.println("Class Level A : "+Example17.a);
	}
}
