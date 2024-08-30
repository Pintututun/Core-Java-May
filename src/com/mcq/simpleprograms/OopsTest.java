package com.mcq.simpleprograms;
public class OopsTest
{
	public String nit() 
	{
		return "Welcome ";
	}

	public static void main(String[] args) 
	{
		OopsTest n = new OopsTest();
		System.out.println("----->"+n.nit());
		
		OopsTest nit1 = new nit();
		System.out.print(nit1.nit());
	}
}

class nit extends OopsTest 
{
	public String nit()
	{
		return "Hello World..";
	}
}
