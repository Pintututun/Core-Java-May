package lambda_program_may23;

class Test<T>
{
	T obj;

	public void setObj(T obj) //setter
	{
		this.obj = obj;
	}

	public T getObj() //getter
	{
		return this.obj;
	}
}

public class Demo2
{
	public static void main(String [] args)
	{
       Test<Integer> ti = new Test<Integer>();
	   ti.setObj(15);
	   System.out.println(ti.getObj());

	   Test<String> ts = new Test<String>();
	   ts.setObj("NIT");
	   System.out.println(ts.getObj());
      
	}
}
