package abstract_program_may25;

import java.util.Scanner;

public class Testing {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the number of food items--");
	int choice=sc.nextInt();
	System.out.println("Enter 1:Egg");
	System.out.println("Enter 2:Bread");
	int option=sc.nextInt();
	switch(option)
	{
	case 1:System.out.print("Enter gms of protein-");
	double pro=sc.nextDouble();
	System.out.print("Enter gms of fats-");
	double fat=sc.nextDouble();
	System.out.print("Enter gms of carbohydrates-");
	double carb=sc.nextDouble();
	Egg f1=new Egg(pro, fat, carb);
	while(choice!=0)
	{
		System.out.println("---------------------------------------------------------");
	System.out.println("Egg");
	System.out.println(f1.getType());
	System.out.println(f1.getTastyScore());
	f1.getMacroNutrients();
	System.out.println("-----------------------------------------------------");
	choice--;
	}
	break;
	case 2:System.out.print("Enter gms of protein-");
	double prot=sc.nextDouble();
	System.out.print("Enter gms of fats-");
	double fats=sc.nextDouble();
	System.out.print("Enter gms of carbohydrates-");
	double carbs=sc.nextDouble();
	Bread f2=new Bread(prot, fats, carbs);
	while(choice!=0)
	{
		System.out.println("---------------------------------------------------------------");
	System.out.println("Bread");
	System.out.println(f2.getType());
	System.out.println(f2.getTastyScore());
	f2.getMacroNutrients();
	System.out.println("-----------------------------------------------------------");
	choice--;
	}
	}
}

}
