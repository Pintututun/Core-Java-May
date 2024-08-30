package lambda_program_may23;

@FunctionalInterface
interface Moveable
{
	void move();  //SAM (Single Abstract Method)
}
class Lambda1 
{
	public static void main(String[] args) 
	{
		Moveable car =  () -> System.out.println("Moving With Car......"); 		
		car.move();		

		Moveable bike = () -> System.out.println("Moving with Bike......");
		bike.move();

		Moveable bus = () -> System.out.println("Moving with Bus......");
		bus.move();
	}
}
