package lambda_program_may23;

interface HotDrink
{
	void prepare();

	static void expressPrepare() //possible from 1.8 onwards
	{
		System.out.println("Prepare without sugar...");
	}	
}
class Tea implements HotDrink
{
	public void prepare()
	{
		System.out.println("Preparing Tea....");
	}	
}
class Coffee implements HotDrink
{
  public void prepare()
	{
		System.out.println("Preparing Coffee...");
	}
}
class StaticMethod 
{
	public static void main(String[] args) 
	{
		HotDrink hk1 = new Tea();
		HotDrink hk2 = new Coffee();
		HotDrink.expressPrepare();  //common for all
		hk1.prepare();
        hk2.prepare();		
	}
}