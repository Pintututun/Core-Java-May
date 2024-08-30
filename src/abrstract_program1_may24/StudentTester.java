package abrstract_program1_may24;


import java.util.Scanner;

public class StudentTester {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	boolean phase=true;
	while(phase==true)
	{
	System.out.print("Enter the student name--");
	String name=sc.nextLine();
	System.out.print("Enter the student class--");
	String sclass=sc.nextLine();
	System.out.println("Enter 1:Science Student");
	System.out.println("Enter 2:History Student");
	int option=sc.nextInt();
	switch(option)
	{
	case 1:System.out.print("Enter the physics marks--");
	int pmark=sc.nextInt();
	System.out.print("Enter the chemistry marks--");
	int cmark=sc.nextInt();
	System.out.print("Enter the maths marks--");
	int mmark=sc.nextInt();
	Student stu=new ScienceStudent(name,sclass,pmark,cmark,mmark);
	System.out.println("Percentage-"+stu.getPercentage());
	break;
	case 2:System.out.print("Enter the history marks--");
	int hmark=sc.nextInt();
	System.out.print("Enter the civics marks--");
	int civicmark=sc.nextInt();
	Student stu1=new HistoryStudent(name, sclass,hmark,civicmark);
	System.out.println("Percentage-"+stu1.getPercentage());
	}
	System.out.println("Do you want to continue--");
	System.out.println("Press Y for Yes Or N for No");
	char choice=sc.next().charAt(0);sc.nextLine();
	if(choice=='Y'||choice=='y')
	{
		phase=true;
	}
	else
	{
		phase=false;
	}
	}
	System.out.println("Total number of students --"+Student.getTotalNoStudents());
}
}
	
