package inheritance2_may10;

public class Shapes {
public static Shape randshape()
{
	int shape=(int)(Math.random()*3);
	
	switch(shape)
	{
	case 0:return new Circle();
	case 1:return new Square();
	case 2:return new Triangle();
	default:System.out.println("Invalid Shape");
	return new Shape();
	}
}
public static void main(String [] args)
{
	Shape shape=randshape();
	shape.draw();
	shape.erase();
}
}
