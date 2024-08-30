package com.mcq.simple;

class IIT{
String name;
public IIT(String name) {
this.name=name;
}
}
class IIT1 extends IIT{
String programmingLanguage;
public IIT1(String programmingLanguage, String name) {
super(name);
this.programmingLanguage=programmingLanguage;
}
}
class IIT2 extends IIT{
String faculty;
public IIT2(String faculty) {
super("Naresh");
this.faculty=faculty;
}
}
public class Opstest8 {
	public static void main(String[] args) {
		IIT nit = new IIT("Project");
		System.out.print(nit.name+" ");
		IIT1 nit1= new IIT1("Java","NareshIT");
		System.out.print(nit1.name+" "+nit1.programmingLanguage+" ");
		IIT2 nit2 = new IIT2("Naidu");
		System.out.println(nit2.name+" "+nit2.faculty);
		}
}
