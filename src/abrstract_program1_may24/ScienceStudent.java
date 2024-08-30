package abrstract_program1_may24;

public class ScienceStudent extends Student {
	private int physicsMarks;
	private int chemistryMarks;
	private int mathsMarks;

	public ScienceStudent(String name,String sclass,int physicsMarks, int chemistryMarks, int mathsMarks) {
		super(name,sclass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}

	@Override
	public int getPercentage() {
	int totalMarks=physicsMarks+chemistryMarks+mathsMarks;
	int percentage=(totalMarks*100)/300;
		return percentage;
	}


}
