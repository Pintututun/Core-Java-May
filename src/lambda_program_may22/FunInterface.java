package lambda_program_may22;

interface NIT
{
public void nit();
}

public class FunInterface {
	public static void main(String[] args) {
		String str = "IT";
		NIT n = () ->
		{
		System.out.println("Naresh" +str);
		};
		n.nit();
}
}
