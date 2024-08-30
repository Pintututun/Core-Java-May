package abstract_program_may22;

public class MyBook extends Book{
	@Override
	public void setTitle(String title)
	{
		this.title=title;
	}
	@Override
	public String getTitle()
	{
		return "The title of my book is : "+this.title; 
	}

}
