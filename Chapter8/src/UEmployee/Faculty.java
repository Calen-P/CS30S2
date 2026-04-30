package UEmployee;

/**
 * Faculty class.
 * 
 * Represents a faculty member in a university.
 * Extends the UEmployee class by adding department information.
 */
public class Faculty extends UEmployee
{
    /** Name of the department the faculty belongs to */
    private String depName;
    
    /**
     * Constructor
     * 
     * Initializes a Faculty object with name, salary, and department.
     * 
     * @param name Employee name
     * @param salary Employee salary
     * @param depart Department name
     * 
     * pre: none  
     * post: Faculty object is created with initialized data
     */
    public Faculty(String name, double salary, String depart)
    {
        // Call superclass constructor to initialize name and salary
        super(name, salary);
        
        // Assign department name
        depName = depart;
    }
    
    /**
     * Returns a string representation of the Faculty object.
     * 
     * Includes:
     * - Employee name (from superclass)
     * - Department name
     * 
     * @return formatted faculty information
     * 
     * pre: none  
     * post: String representation is returned
     */
    public String toString()
    {
        // Combine name and department into a single string
        return(super.getName() + ", " + depName);
    }
    
}