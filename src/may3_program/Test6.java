package may3_program;

class Test6
{
Test6( )
{
System.out.println("Object address inside constructor : "+this);
}
public static void main(String args[ ])
{
Test6 obj = new Test6();
System.out.println("Object address inside main : "+obj);
}
}