package SalesCenter;

public class Manager extends Employee
{
	private double yearlySalary; //Instance variable
	
	public Manager(String fn, String ln, double s) //Constructor
	{
		super(fn, ln);
		
		yearlySalary = s;
	}
	
	public double pay(double weeks)
	{
		double payEarned;
		
		payEarned = yearlySalary / 52 * weeks;
		
		return payEarned;
	}
	
	public String toString()
	{
		return(super.toString() + ", Manager" + "Salary: " + yearlySalary);
	}
}