package interface_type_may17;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Restaurant r=new Restaurant();
	System.out.println("Welcome to our "+r.getClass().getSimpleName());
	System.out.println("-------------------------------------------------------------");
	System.out.println("Enter 1:Tea");
	System.out.println("Enter 2:Coffee");
	System.out.println("Enter 3:Horlicks");
	System.out.println("Enter 4:Boost");
	System.out.print("Enter your option--");
	int option=sc.nextInt();
	switch(option)
	{
	case 1:HotDrink h1=new Tea();
	r.createObject(h1);
	break;
	case 2:HotDrink h2=new Coffee();
	r.createObject(h2);
	break;
	case 3:HotDrink h3=new Horlicks();
	r.createObject(h3);
	break;
	case 4:HotDrink h4=new Boost();
	r.createObject(h4);
	break;
	default :System.out.println("Wrong choice");
}
}
}
