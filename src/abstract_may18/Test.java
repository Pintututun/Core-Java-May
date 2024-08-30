package abstract_may18;

public class Test extends Car1 {
	
	public Test(String name,String model,int mil,int speed,int manfacturing) {
		super(name,model,mil,speed,manfacturing);
		
	}
	@Override
	public void display() {
		 System.out.println("Brand: " + car_brand());
	        System.out.println("Model: " + car_model());
	        System.out.println("Mileage: " + car_mileage());
	        System.out.println("Top Speed: " + car_topSpeed());
	        System.out.println("Year of Manufacturing: " + car_year());

	}
	public static void main(String[] args) {
	   Car1 testCar=new Test("Hyundai","i10",30,120,2021);
		testCar.display();
	}

}

