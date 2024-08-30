package inheritance_may10;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter the length of rectangle-");
	double len=sc.nextDouble();
	System.out.print("Enter the width of rectangle-");
	double wid=sc.nextDouble();
	System.out.print("Enter the length of cuboid--");
	double length=sc.nextDouble();
	System.out.print("Enter the width of cuboid--");
	double width=sc.nextDouble();
	
	Rectangle rec=new Rectangle(wid,len);
	Cuboid cub=new Cuboid();
	System.out.println(rec.computeArea(len, wid));
	System.out.println(cub.computeArea(length, width,15));
	
	
}
}
