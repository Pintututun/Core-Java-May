package lambda_program_may22;

import java.util.function.Supplier;

public class Fun_Interface {
	public static void main(String[] args) {
		Supplier<String> str = () -> String.valueOf(1);
		System.out.println(str.get());
		}
}
