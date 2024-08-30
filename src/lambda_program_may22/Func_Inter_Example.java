package lambda_program_may22;

@FunctionalInterface
interface NIT24
{
void nit(String name);
}
public class Func_Inter_Example{
	public static void main(String[] args) {
		NIT24 nit = (String name) -> System.out.println("NareshIt");
		nit.nit("NARESHIT");
		}
}
