package Mastery;

abstract class UEmployee
{
	private String name;
	private double salary;
	
	public UEmployee(String n, double s)
	{
		name = n;
		salary = s;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getSalary()
	{
		return salary;
	}
}
