package test_april30;

public class Test16
{
public static void main(String args[]) 
{
B obj = new B();
obj.foo(0, "");	
}
}

class A
{
void foo(int i, String s) 
{
System.out.println("A");
}
}
class B extends A 
{
void foo(String s, int i) 
{
System.out.println("B");
}
}