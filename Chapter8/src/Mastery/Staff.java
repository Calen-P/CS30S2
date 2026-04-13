package Mastery;

public class Staff extends UEmployee
{
	private String title;
	
	public Staff(String name, double salary, String jobTitle)
	{
		super(name, salary);
		
		title = jobTitle;
	}
	
	public String toString()
	{
		return(super.getName() + ", " + title);
	}
}
