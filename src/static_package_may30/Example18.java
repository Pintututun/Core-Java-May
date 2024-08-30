package static_package_may30;

public class Example18 {
	static {
		int a = 50;
		
		Example18.a = Example18.a+a;
		a = a+Example18.a;
		Example18.a = a+a;
		System.out.println(Example18.a);
	}

	static int a = 60;

	public static void main(String[] args) {
		System.out.println("Class Level A : "+Example18.a);
	}
}
