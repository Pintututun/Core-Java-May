package lambda_program_may22;

import java.util.function.Function;

public class FunInter {
	public static void main(String args[])
	{
	Function<Integer, Double> div = a -> a / 2.0;
	System.out.println(div.apply(15));
	}
}
