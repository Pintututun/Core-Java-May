package com.mcq.simple;
class NT
{
static int a=90;
String object;
public NT(String name) {
this.object=name;
NT.this.a+=1;
}
static int get_counter()
{
return NT.a;
}
}
public class Opstest6 {
	public static void main(String[] args) {
		NT nit = new NT("nit");
		NT nit1 = new NT("nit");
		NT nit2 = new NT("nit");
		NT nit3 = new NT("nit");
		NT nit4 = new NT("nit");
		NT nit5 = new NT("nit");
		NT nit6 = new NT("nit");
		NT nit7 = new NT("nit");
		System.out.println(NT.get_counter()-91);
		}

}
