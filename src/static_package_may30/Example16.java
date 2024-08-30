package static_package_may30;

public class Example16 {
	static int x =50;
	
	public static void main(String[] args) {
		int x = 60;
		Example16.x = Example16.x+x;
	
		x = x+Example16.x;

		Example16.x = Example16.x+x+Example16.x;
		
		System.out.println(Example16.x);
		System.out.println(x);
	}
}
