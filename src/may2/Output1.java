package may2;

public class Output1 {
	    public static void main(String [] args)
	    {
	        Count t = new Count();
	        t.count();
	    }
	}

	class Count extends Count2
	{
	    Count()
	    {

	    }
	}
	class Count2
	{
	    void count()
	    {
	        System.out.print("Output = ");

	        for (int x = 0; x < 7; x++,x++ )
	        {
	            System.out.print(" " + x);
	        }
	    }
	}