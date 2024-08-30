package may3_program;

class Test4
{
Test4( )
{
System.out.println(this);
System.out.println(this.hashCode());
}
public static void main(String args[ ])
{
	Test4 t=new Test4( );
	Test4 t1=new Test4();
	Test4 t2=new Test4();
	}
	}