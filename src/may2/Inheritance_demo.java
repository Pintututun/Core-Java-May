package may2;
class Ax
{
int i;
void display()
{
System.out.println(i);
}
}
class Bx extends Ax
{
int j;
void display()
{
System.out.println(j);
}
}
public class Inheritance_demo
{
public static void main(String args[])
{
Bx obj = new Bx();
obj.i=1;
obj.j=2;
obj.display();
}
}