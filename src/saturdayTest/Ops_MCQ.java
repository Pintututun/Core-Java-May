package saturdayTest;

public class Ops_MCQ {
	void swap_names(String name1,String name2) {
		String temp="";
	    temp=name1;
	    name1=name2;
	    name2=temp;
	}
	public static void main(String[] args) {
		String name1="Roger";
		String name2="Robert";
		System.out.println("Before swapping: name1="+name1+" name2="+name2);
		Ops_MCQ t11 = new Ops_MCQ();
		t11.swap_names(name1,name2);
		System.out.println("After swapping: name1="+name1+" name2="+name2);
	}
}
