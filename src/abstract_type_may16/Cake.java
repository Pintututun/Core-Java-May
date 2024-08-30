package abstract_type_may16;

public abstract class Cake {
private String shapeType;
private String flavour;
private int qty;
private float price;

public Cake(String shapeType, String flavour, int qty) {
	super();
	this.shapeType = shapeType;
	this.flavour = flavour;
	this.qty = qty;
	this.price = qty*400;
	
}
protected String getShapeType() {
	return shapeType;
}
protected void setShapeType(String shapeType) {
	this.shapeType = shapeType;
}
protected String getFlavour() {
	return flavour;
}
protected void setFlavour(String flavour) {
	this.flavour = flavour;
}
protected int getQty() {
	return qty;
}
protected void setQty(int qty) {
	this.qty = qty;
}
protected float getPrice() {
	return price;
}
protected void setPrice(float price) {
	this.price = price;
}
protected void showCake()
{
	System.out.println("A "+this.shapeType+this.flavour+" of "+this.qty+" Kg/Kg's Ready @ "+" Rs."+this.price);
}
}
