package test_april30;
class Base
{
    int value=0;
    Base()
	{
    addValue();
    }
    void addValue(){
    value += 10;
    }
   int getValue(){
     return value;
   }
 }
class Derived extends Base{
  Derived(){
   addValue();
  }
 void adValue(){
	 super.addValue();
 value +=  30;
  }
}
public class Test5 {
  public static void main(String[] args){
      Derived b = new Derived();		  
      System.out.println(b.getValue());
  }
}