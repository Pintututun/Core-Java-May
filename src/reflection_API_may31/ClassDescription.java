package reflection_API_may31;

import java.lang.reflect.Method;

public class ClassDescription {

	public static void main(String[] args) throws ClassNotFoundException 
	{
		          
		Class<?> cls = Class.forName(args[0]);
		System.out.println(Class.forName(args[0]));
		System.out.println(cls);
		System.out.println("Name of the class :"+cls.getName());
		System.out.println("Name of the Package :"+cls.getPackageName());
         
	    Method [] methods = cls.getDeclaredMethods();
	    int count =0;
	    for(Method x : methods)
	    {
	    	count++;
	    	System.out.println(x.getName());
	    }
        System.out.println("The total methods present are :"+count);
	}

	
}
