package lambda_program_may22;

@FunctionalInterface
interface Str
{
	int methodStr(String str);
}

public class Functional_Interface {
public static void main(String[] args) {
Str str1 =(str)-> str.compareTo("Ab");

System.out.println(str1.methodStr("AB"));
}
}
