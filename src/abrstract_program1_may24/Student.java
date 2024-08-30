package abrstract_program1_may24;

public abstract class Student {
protected String studentName;
protected String studentClass;
protected static int totalNoOfStudents;
public abstract int getPercentage();
public static int getTotalNoStudents()
{
	return totalNoOfStudents;
}

public Student() {
	super();
}
public Student(String studentName, String studentClass) {
	super();
	this.studentName = studentName;
	this.studentClass = studentClass;
	totalNoOfStudents++;
}

}
