package lambda_program_may23;

import java.util.function.*;
import java.util.Scanner;
public class Demo1 {
	public static void main(String [] args)
	{
       Predicate<String> p2 =  str ->str.startsWith("A");
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter your Name :");
	   String name = sc.next();
	  System.out.println("Is "+name+" starts with A :"+p2.test(name));
		      
	}
}
