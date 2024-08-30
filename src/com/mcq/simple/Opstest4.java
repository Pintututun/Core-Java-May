package com.mcq.simple;

class NItt
{
int a;
public NItt(int a) {
this.a=a;
}
 int getNum()
{
return this.a;
}
}
class NIT1 extends NItt
{
int a;
public NIT1(int a,int b) {
super(a);
this.a=b;
}
int getVal()
{
return this.a;
}
}

public class Opstest4 {
	public static void main(String[] args) {
		NIT1 nit = new NIT1(74,152);
		System.out.print(nit.getNum()+" "+nit.getVal());
		}
}
