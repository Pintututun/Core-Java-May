package enumconcept_may11;

public class Manager extends Employee 
{
	private ManagerType type;

	public Manager() {
		super();
	}

	public Manager(String name,int employeeId,double salary,ManagerType type) {
		super(name,employeeId,salary);
		this.type = type;
		this.setSalary(salary);
	}

	public ManagerType getType() {
		return type;
	}

	public void setType(ManagerType type) {
		this.type = type;
	}
    @Override
	public void setSalary(double salary) {
		if(this.type == ManagerType.HR)
		{
			super.setSalary(salary+10000);
		}
		else if(this.type==ManagerType.SALES)
		{
			super.setSalary(salary+5000);
		}
		
	}

	@Override
	public String toString() {
		return "Manager [type=" + type + ", getType()=" + getType() + ", getName()=" + getName() + ", getEmployeeId()="
				+ getEmployeeId() + ", getSalary()=" + getSalary() + "]";
	}
    
    
	
}

