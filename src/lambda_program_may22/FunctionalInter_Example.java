package lambda_program_may22;

@FunctionalInterface
interface NIT27
{
String nit(String name);
}	
public class FunctionalInter_Example {
	public static void main(String[] args) {
		NIT27 nit = (String name) -> "Welcome to ";
		System.out.println(nit.nit("NARESHIT"));
		}
}
