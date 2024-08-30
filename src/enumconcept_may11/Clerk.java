package enumconcept_may11;

public class Clerk extends Employee {
int speed;
int accuracy;
public int getSpeed() {
	return speed;
}

public Clerk() {
	super();
}


public Clerk(String name,int employeeId,double salary,int speed, int accuracy) {
	super(name,employeeId,salary);
	this.speed = speed;
	this.accuracy = accuracy;
	this.setSalary(salary);
}

public void setSpeed(int speed) {
	this.speed = speed;
}
public int getAccuracy() {
	return accuracy;
}
public void setAccuracy(int accuracy) {
	this.accuracy = accuracy;
}
@Override
public void setSalary(double salary)
{
	boolean amount=true;
	if(this.speed>70&&this.accuracy>80&&amount)
	{
		super.setSalary(salary+1000);
		amount=false;
	}
	else
	{
		super.setSalary(salary);
	}

}

@Override
public String toString() {
	return "Clerk [speed=" + speed + ", accuracy=" + accuracy + ", getSpeed()=" + getSpeed() + ", getAccuracy()="
			+ getAccuracy() + ", getName()=" + getName() + ", getEmployeeId()=" + getEmployeeId() + ", getSalary()="
			+ getSalary() + "]";
}


}

