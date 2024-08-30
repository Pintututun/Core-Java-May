package reflection_API_may31;

class Message
{
	public void greet()
	{
		System.out.println("Hello Everyone I hope you are fine..");
	}
}
public class NoClassDefFoundErrorDemo 
{
	public static void main(String[] args) 
	{
		Message m = new Message();
		m.greet();
	}
}
