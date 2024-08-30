package jvm_architecture_may26;

public class Test {
	public static void main(String[] args) 
	{
	  System.out.println("Loaded BY :"+Test.class.getClassLoader());
	  System.out.println("Paraent of Application :"+Test.class.getClassLoader().getParent().getParent());

	}
}
