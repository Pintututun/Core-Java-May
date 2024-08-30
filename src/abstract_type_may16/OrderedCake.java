package abstract_type_may16;

import java.util.Scanner;

public class OrderedCake extends Cake {
private String message;
Scanner sc=new Scanner(System.in);
public OrderedCake() {
	super("Round","Vanilla",1);
}

public OrderedCake(String shapeType, String flavour, int qty) {
	super(shapeType, flavour, qty);
	
	
}

public OrderedCake(String shapeType, String flavour, int qty, String message) {
	super(shapeType, flavour, qty);
	this.message = message;
	
}
@Override
public void showCake()
{
	if(this.message!=null||this.message=="")
	{
	System.out.println("A "+this.getShapeType()+this.getFlavour()+" of "+this.getQty()+" Kg/Kg's Ready "+" Rs."+this.getPrice()+" "+this.message);
	}
	else
	{
		super.showCake();
	}
}

}
