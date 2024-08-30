package lambda_program_may23;

@FunctionalInterface
interface Length
{
	 int getLength(String str);
}
public class Lambda4 
{
	public static void main(String[] args) 
	{
		 Length l =  str -> str.length();		

        java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Enter your Name :");
		String name = sc.nextLine();
		System.out.println("Length of "+name+" is :"+l.getLength(name));
	}
}
