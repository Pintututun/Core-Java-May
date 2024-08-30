package lambda_program_may22;

@FunctionalInterface
interface Str1
{
	int methodStr(String str);
}
public class FunctionInterface {
	public static void main(String[] args) {
		Str1 str = (String s) -> s.compareTo("goolge");
		System.out.println(str);
		}
}
