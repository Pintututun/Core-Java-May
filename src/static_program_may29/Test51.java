package static_program_may29;

public class Test51 {
	static int x = 10; 
	public static void main(String[] args) 
	{ 
		System.out.println(x); 
	} 
	static
	{ 
		System.out.print(""+x+" "); 
	}
}
