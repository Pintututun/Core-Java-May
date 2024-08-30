package lambda_program_may23;

import java.util.function.*;
import java.util.Scanner;
public class Demo {
	public static void main(String [] args)
	{
       Predicate<Integer> p3 =  num -> num%4==0;
	   
	   Scanner sc = new Scanner(System.in);
	   System.out.print("Enter A year:");
	   int year = sc.nextInt();
	  System.out.println("Is "+year+" leap year :"+p3.test(year));
		      
	}
}
