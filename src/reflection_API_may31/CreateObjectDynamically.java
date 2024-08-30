package reflection_API_may31;

class Student1
{
	public void getMessage()
	{
		System.out.println("Hot summer!!!!");
	}
}

public class CreateObjectDynamically 
{
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException 
	{
		Object obj = Class.forName(args[0]).newInstance();
	    Student1 st = (Student1) obj; //Downcasting
	    st.getMessage();
	    
	}

}

