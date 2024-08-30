package enumeration_may15;

enum Course 
{
	Java, Python;
	private Course() 
	{
		System.out.println(12);
	}
}

class EnumTest 
{
	public static void main(String[] args) 
	{
		Course nit = Course.Python;
	}
}
