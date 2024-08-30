package com.mcq.simple;

class NIT
{ int name;
NIT(int name)
{ this.name = name;
}
}
public class Opstest {
	public static void main(String[] args)
	{ NIT f1 = new NIT(10);
	NIT f2 = new NIT(10);
	NIT f3 = f2;
	System.out.println(f1==f2);
	System.out.println(f2==f3);
	System.out.println(f1.name==f2.name);
	System.out.println(f2.name==f3.name);
	System.out.println(f1!=f3);
	}
}
