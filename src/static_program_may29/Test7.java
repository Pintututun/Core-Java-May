package static_program_may29;

public class Test7 {
	//static variable a
			static int a =10 ;
			public static void main(String[] args) {
				System.out.println(Test7.a);
			}
			static
			{
				System.out.println(Test7.a);
			}
}
