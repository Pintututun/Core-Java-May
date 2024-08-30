package static_package_may30;

public class Example15 {
	static int x =100;
	
	public static void main(String[] args) {
		int x = 200;
		System.out.println(Example15.x);
		System.out.println(x);
	}
}
