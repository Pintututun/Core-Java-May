package abstract_type_may16;

import java.util.Scanner;

public class CakeMain {
public static void main(String[] args) {
	Scanner st=new Scanner(System.in);
	Cake or=new OrderedCake();
	or.showCake();
	System.out.print("Enter the shape--");
	String shape=st.nextLine();
	System.out.print("Enter the flavour--");
	String flavour=st.nextLine();
	System.out.print("Enter the quantity--");
	int qty=st.nextInt();st.nextLine();
	System.out.print("Enter the message--");
	String msg=st.nextLine();
	Cake ck=new OrderedCake(shape, flavour, qty, msg);
		ck.showCake();
		st.close();
	
}
}
