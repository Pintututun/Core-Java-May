package saturdayTest;

class X
{
	void method1(){
		System.out.println("A");	
	}
}
public class Y extends X {
	public static void main(String[] args) {
		Y y=new Y();
		y.method1();
	}
}
