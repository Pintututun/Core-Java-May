package abstract_type_may17;

public abstract class Car {
protected int speed=90;
public abstract void run();
public Car() {
	super();
}

public void getDetails()
{
	System.out.println("Car is "+this.getClass().getSimpleName()+" with speed "+speed);
}


}
