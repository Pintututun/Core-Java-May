package inheritance_may10;

public class Cuboid extends Rectangle {
	double height;
	
public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

public Cuboid() {
	super();
	this.height=15;
	}

public double computeArea(double length,double width,double height)
{
area= 2*(length*width+width*height+height*length);
return super.area;
}
@Override
public void show() {
	System.out.println("Width: "+this.width);
	System.out.println("Height: "+this.height);
	System.out.println("Lenght: "+this.length);
	System.out.println(this.computeArea(this.length,this.width,this.height));
}
}

