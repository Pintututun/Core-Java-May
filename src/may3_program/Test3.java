package may3_program;

public class Test3
{
static
{
System.out.println("static block is executed");
}
{
System.out.println(this);
System.out.println("Non-static block is executed");
}
public static void main(String[] args) {
System.out.println("main");
}
}

