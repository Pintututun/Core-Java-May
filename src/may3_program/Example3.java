package may3_program;

class Example3
{
static int a=10;
static int b=20;
int x=30;
int y=40;
public static void main(String[] args)
{
Example3 e1=new Example3();
Example3 e2=new Example3();
Example3 e3=null;
e1.a=50;
e1.b=60;
e1.x=70;
e1.y=80;
System.out.println("a->"+e1.a+"b->"+e1.b+"x->"+e1.x+"y->"+e1.y);
System.out.println("a->"+e1.a+"b->"+e1.b+"x->"+e2.x+"y->"+e2.y);
}
}

