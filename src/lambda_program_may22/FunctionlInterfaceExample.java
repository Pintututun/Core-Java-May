package lambda_program_may22;

@FunctionalInterface
interface NIT22
{
void nit(String str);
String toString();
int hashCode();
boolean equals(Object o);
}
public class FunctionlInterfaceExample implements NIT22{
	@Override
	public void nit(String str) {
	System.out.println(str);
	}
	public static void main(String[] args)
	{
	FunctionlInterfaceExample function = new FunctionlInterfaceExample();
	function.nit("Hai NareshIT");
	}

}
