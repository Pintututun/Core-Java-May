package abstract_program2_may25;

public class Friend extends Acquaintance{
	 protected String homeTown;

	    public Friend(String name, String homeTown) {
	        super(name);
	        this.homeTown = homeTown;
	    }

	    public void getStatus() {
	        System.out.println(name + " is a friend and he is from " + homeTown + ".");
	    }
	}

