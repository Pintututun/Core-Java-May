package lambda_program_may22;

interface NIT30
{
String nit(String name);
}
public class FunctionalInterface1 {
	public static void main(String[] args) {
		NIT30 nit = (String name) -> "Welcome to " + name;
		System.out.println(nit.nit("NARESHIT"));
		}
}
