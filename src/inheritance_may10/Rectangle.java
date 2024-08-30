package inheritance_may10;

public class Rectangle extends GeometricShape {
double width;
double length;

public Rectangle() {
	super();
	this.width = 10;
	this.length = 10;
}

public Rectangle(double width, double length) {
	super();
	this.width = width;
	this.length = length;
}

public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public double getLength() {
	return length;
}
public void setLength(double length) {
	this.length = length;
}
@Override
public double computeArea(double length,double width)
{
   area=length*width;
   return super.area;
}
@Override
public void show() {
	System.out.println("Length :"+this.length);
	System.out.println("Width :"+this.width);
	System.out.println(this.computeArea(this.length,this.width));
	

}


}
