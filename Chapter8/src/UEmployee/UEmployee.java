package UEmployee;

/**
 * UEmployee class.
 * 
 * Represents a generic university employee.
 * Serves as a superclass for different employee types
 * such as Faculty and Staff.
 */
public class UEmployee
{
    /** Employee name */
    private String name;
    
    /** Employee salary */
    private double salary;
    
    /**
     * Constructor
     * 
     * Initializes a UEmployee object with name and salary.
     * 
     * @param n Employee name
     * @param s Employee salary
     * 
     * pre: none  
     * post: UEmployee object is created with initialized data
     */
    public UEmployee(String n, double s)
    {
        // Assign name and salary values
        name = n;
        salary = s;
    }
    
    /**
     * Gets the employee's name.
     * 
     * @return name of employee
     * 
     * pre: none  
     * post: Name is returned
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the employee's salary.
     * 
     * @return salary of employee
     * 
     * pre: none  
     * post: Salary is returned
     */
    public double getSalary()
    {
        return salary;
    }
}