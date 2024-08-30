package abstract_program_may25;

public class Bread extends Food {
String type="vegetarian";
int tastyScore=8;


	public Bread(double proteins, double fats, double carbs) {
		super();
	this.proteins=proteins;
	this.fats=fats;
	this.carbs=carbs;
}


	public int getTastyScore() {
		return tastyScore;
	}


	public String getType() {
		return type;
	}


	@Override
	public void getMacroNutrients() {
		System.out.println("A slice of bread has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");
		

	}

}
