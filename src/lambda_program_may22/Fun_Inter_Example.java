package lambda_program_may22;

@FunctionalInterface
interface NIT31
{
String nit(String name);
}
public class Fun_Inter_Example implements NIT31 {
	public static void main(String[] args) {
		Fun_Inter_Example nit = new Fun_Inter_Example();
		System.out.println(nit.nit("Welcome to "));
		}
		@Override
		public String nit(String name) {
		return name+"NARESHIT";
		}
}
