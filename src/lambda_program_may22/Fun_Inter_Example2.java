package lambda_program_may22;

@FunctionalInterface
interface NIT34
{
String nit(String name);
}
public class Fun_Inter_Example2 {
	public static void main(String[] args) {
		NIT34 nit = (String name) -> name;
		NIT34 nit1 = (String name) -> name;
		System.out.println(nit.nit("Welcome to ")+nit1.nit("NARESHIT"));
		}
}
