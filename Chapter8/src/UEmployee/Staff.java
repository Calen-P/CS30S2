package UEmployee;

/**
 * Staff class.
 * 
 * Represents a staff member in a university.
 * Extends the UEmployee class by adding a job title.
 */
public class Staff extends UEmployee
{
    /** Job title of the staff member */
    private String title;
    
    /**
     * Constructor
     * 
     * Initializes a Staff object with name, salary, and job title.
     * 
     * @param name Employee name
     * @param salary Employee salary
     * @param jobTitle Staff job title
     * 
     * pre: none  
     * post: Staff object is created with initialized data
     */
    public Staff(String name, double salary, String jobTitle)
    {
        // Call superclass constructor to initialize name and salary
        super(name, salary);
        
        // Assign job title
        title = jobTitle;
    }
    
    /**
     * Returns a string representation of the Staff object.
     * 
     * Includes:
     * - Employee name (from superclass)
     * - Job title
     * 
     * @return formatted staff information
     * 
     * pre: none  
     * post: String representation is returned
     */
    public String toString()
    {
        // Combine name and title into a single string
        return(super.getName() + ", " + title);
    }
}