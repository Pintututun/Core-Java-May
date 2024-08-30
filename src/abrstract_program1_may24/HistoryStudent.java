package abrstract_program1_may24;

public class HistoryStudent extends Student {
private int historyMarks;
private int civicsMarks;


	public HistoryStudent(String name,String sclass,int historyMarks, int civicsMarks) {
	super(name,sclass);
	this.historyMarks = historyMarks;
	this.civicsMarks = civicsMarks;
}


	@Override
	public int getPercentage() {
	int totalMarks=historyMarks+civicsMarks;
	int percentage=(totalMarks*100)/200;
		return percentage;
	}

}
