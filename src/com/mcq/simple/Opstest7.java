package com.mcq.simple;

class WL
{
public int nit() {
return 10;
}
protected int nit1()
{
return 5;
}
}
class WL1 extends WL
{
@Override
public int nit() {
return super.nit();
}
public int nit1()
{
return 15;
}
private int nit2()
{
return 20;
}
}
class NIT2 extends WL1
{
public int nit()
{
return 0;
}
public int nit1()
{
return 50;
}
}
public class Opstest7 {
	public static void main(String[] args) {
		WL object = new WL();
		WL object1 = new WL1();
		WL object2 = new NIT2();
		WL1 object3 = new NIT2();
		System.out.println(object.nit()+object1.nit1()+object1.nit()+object3.nit1()+object2.nit1());
}
}
