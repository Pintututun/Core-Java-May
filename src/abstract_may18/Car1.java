package abstract_may18;

public abstract class Car1 {
String brand;
String model;
int mileage;
int top_speed;
int yearOfManufacturing;
public Car1() {
	super();
}

public Car1(String brand, String model, int mileage, int top_speed, int yearOfManufacturing) {
	super();
	this.brand = brand;
	this.model = model;
	this.mileage = mileage;
	this.top_speed = top_speed;
	this.yearOfManufacturing = yearOfManufacturing;
}

public String car_brand()
{
	return brand;
}
public String car_model()
{
	return model;
}
public int car_mileage()
{
	return mileage;
}
public int car_topSpeed()
{
	return top_speed;
}
public int car_year()
{
	return yearOfManufacturing;
}
public abstract void display();

}
