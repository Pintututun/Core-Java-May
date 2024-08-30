package enumconcept_may11;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	String h="HR";String sa="SALES";
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the name of employee-");
	String name=sc.nextLine();
	System.out.print("Enter the id of employee-");
	int id=sc.nextInt();
	System.out.print("Enter the salary of employee-");
	double salary=sc.nextDouble();
	System.out.println("Enter 1:Manager");
	System.out.println("Enter 2:Clerk");
	System.out.print("Enter your option--");
	int option=sc.nextInt();sc.nextLine();
	switch(option)
	{
	case 1:
		System.out.print("Enter the type of Manager is HR/SALES-");
	String type=sc.nextLine();
	
	if(type.equalsIgnoreCase(h))
	{
	Manager m=new Manager(name, id, salary, ManagerType.HR);
	System.out.println(m);
	}
	else if(type.equalsIgnoreCase(sa))
	{
		Manager m=new Manager(name, id, salary, ManagerType.SALES);
		System.out.println(m);
		
	}
	break;
	case 2:System.out.print("Enter the speed of clerk-");
	int speed=sc.nextInt();
	System.out.print("Enter the accuracy of clerk-");
	int accuracy=sc.nextInt();
	Clerk c1=new Clerk(name, id, salary, speed, accuracy);
	System.out.println(c1);
	break;
	default:System.out.println("Enter the correct choice");
	}
	sc.close();
}
}

