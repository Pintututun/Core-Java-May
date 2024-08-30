package abstract_program2_may25;

import java.util.Scanner;

public class Testing {
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter the name of acquiantance--");
		 String acq=sc.nextLine();
	        Acquaintance acquaintance = new Acquaintance(acq);
	        acquaintance.getStatus();
         System.out.print("Enter the name of friend--");
         String fr=sc.nextLine();
         System.out.print("Enter the hometown--");
         String hm=sc.nextLine();
	        Friend friend = new Friend(fr,hm);
	        friend.getStatus();
	        System.out.print("Enter the name of bestfriend--");
	         String frn=sc.nextLine();
	         System.out.print("Enter the hometown of bestfriend--");
	         String hme=sc.nextLine();
	         System.out.print("Enter the favourite song--");
	         String song=sc.nextLine();

	        BestFriend bestFriend = new BestFriend(frn,hme,song);
	        bestFriend.getStatus();
	    }
	}
