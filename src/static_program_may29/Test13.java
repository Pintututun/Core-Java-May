package static_program_may29;

public class Test13 {
	static {
		System.out.println("Test13 : SB1 called");
		m1();
	}
	static void m1() {
		System.out.println("Test13 : m1() called");
	}
	public static void main(String[] args) {
		
	}
}
