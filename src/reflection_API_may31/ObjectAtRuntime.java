package reflection_API_may31;

class ObjectAtRuntime 
{	
   public static void main(String [] args) throws Exception
   {
      Object obj =   Class.forName(args[0]).newInstance();
      Class cls = obj.getClass();
      System.out.println(cls);
	  String name = cls.getName();
      System.out.println("Object created for ="+name);
  	}
}
