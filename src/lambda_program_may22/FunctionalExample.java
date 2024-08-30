package lambda_program_may22;

@FunctionalInterface
interface NIT28
{
String str(String ni);
}
public class FunctionalExample {
	public static void main(String[] args) {
		NIT28 nit = (String ni) -> ni +"";
		System.out.println(nit.str("PINTU"));
		}
}
