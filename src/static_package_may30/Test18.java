package static_package_may30;

public class Test18 {
	static int a = 20;
	public static void main(String[] args) {
		Test18 t1 = new Test18();
		Test18 t2 = new Test18();
		
		System.out.println("A : "+a);
		System.out.println("t1.A : "+t1.a);
		System.out.println("t2.A : "+t2.a);
		t1.a=30;
		System.out.println("t1.A : "+t1.a);
		System.out.println("t2.A : "+t2.a);
		t2.a=40;
		System.out.println("t1.A : "+t1.a);
		System.out.println("t2.A : "+t2.a);
	}
}
