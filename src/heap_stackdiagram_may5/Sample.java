package heap_stackdiagram_may5;

public class Sample
{
private Integer i1;
public static void main(String[] args)
{
Sample s1 = new Sample();
System.out.println(s1.i1);
Sample s2 = new Sample();
Sample s3 = modify(s2);
s1=null;
//GC
System.out.println(s2.i1);
}
public static Sample modify(Sample s)
{
s.i1=9;
s= new Sample();
s.i1= 20;
s=null;
return s;
}
}