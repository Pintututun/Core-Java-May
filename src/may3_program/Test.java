package may3_program;

class Test {
int a ;
Test(){
System.out.println("Constructor");
}
{
System.out.println("Non-static block");
}
public static void main(String[] args) {
System.out.println("main method");
new Test();
}
}