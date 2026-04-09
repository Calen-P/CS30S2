package Mastery;

abstract class UEmployee
{
	private String name;
	
	public UEmployee(String n)
	{
		name = n;
	}
	
	public String toString()
	{
		return name;
	}
	
	abstract double pay();
}
