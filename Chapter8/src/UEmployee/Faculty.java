package UEmployee;

public class Faculty extends UEmployee
{
	private String depName;
	
	public Faculty(String name, double salary, String depart)
	{
		super(name, salary);
		
		depName = depart;
	}
	
	public String toString()
	{
		return(super.getName() + ", " + depName);
	}
	
}
