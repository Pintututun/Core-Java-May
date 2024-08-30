package com.mcq.simple;

class NiiT
{
static int a=90;
String object;
public NiiT(String name) {
this.object=name;
NiiT.this.a+=1;
}
static int get_counter()
{
return NiiT.a;
}
}
public class Opstest5 {
	public static void main(String[] args) {
		NiiT nit = new NiiT("nit");
		NiiT nit1 = new NiiT("nit");
		NiiT nit2 = new NiiT("nit");
		NiiT nit3 = new NiiT("nit");
		NiiT nit4 = new NiiT("nit");
		NiiT nit5 = new NiiT("nit");
		NiiT nit6 = new NiiT("nit");
		NiiT nit7 = new NiiT("nit");
		System.out.println(NiiT.get_counter()-91);
		}
}
