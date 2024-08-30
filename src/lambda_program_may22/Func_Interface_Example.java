package lambda_program_may22;

@FunctionalInterface
interface NIT23
{
int cal(int value);
}
public class Func_Interface_Example {
	public static void main(String[] args) {
		NIT23 nit = (int value) -> value+25;
		System.out.println("Result: "+nit.cal(20));
		}
}
