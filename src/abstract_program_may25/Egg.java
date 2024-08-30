package abstract_program_may25;

public class Egg extends Food {
String type="non-vegetarian";
int tastyScore=7;
	public Egg(double proteins, double fats, double carbs) {
		super();
	this.proteins=proteins;
	this.fats=fats;
	this.carbs=carbs;
}
	

	public String getType() {
		return type;
	}


	


	public int getTastyScore() {
		return tastyScore;
	}



	@Override
	public void getMacroNutrients() {
		System.out.println("An egg has "+this.proteins+" gms of protein, "+this.fats+" gms of fats and "+this.carbs+" gms of carbohydrates.");

	}

}
