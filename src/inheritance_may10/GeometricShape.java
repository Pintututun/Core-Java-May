package inheritance_may10;

public class GeometricShape {
String shapeType;
double area;

public GeometricShape() {
	super();
	shapeType="Rectangle";
	area=0.0;
}

public double computeArea(double l,double w)
{
	area=l*w;
	return area;
}


public void show() {
	System.out.println("ShapeType:"+shapeType);
	System.out.println("Area:"+area);
}

}
