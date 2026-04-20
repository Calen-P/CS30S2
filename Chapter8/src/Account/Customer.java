package Account;

/**
 * Customer class.
 */

public class Customer {
	private String firstName, lastName;

	//create String variables street, city, province, postal code	
	private String city, street, province, postalCode;

	
	/**
	 * constructor
	 * pre: none
	 * post: A Customer object has been created. 
	 * Customer data has been initialized with parameters.
	 */
	public Customer(String fName, String lName, String s, String c, String p, String pCode) //modify constructor to include street, city, province, postal code
	{
		firstName = fName;
		lastName = lName;

		//reflect the changes in the parameter
		street = s;
		city = c;
		province = p;
		postalCode = pCode;
	}
	
	//create changeStreet method that asks the user their street and records street in a variable above
	public void changeStreet(String s)
	{
		street = s;
	}
	
	//create changeCity method that asks the user their city and records city in a variable above
	public void changeCity(String c)
	{
		city = c;
	}

	//create changeProvince method that asks the user their province and records province in a variable above
	public void changeProvince(String p)
	{
		province = p;
	}

	//create changePostalCode method that asks the user their postal code and records postal code in a variable above
	public void changePostalCode(String pCode)
	{
		postalCode = pCode;
	}


	/** 
	 * Returns a String that represents the Customer object.
	 * pre: none
	 * post: A string representing the Customer object has 
	 * been returned.
	 */
	public String toString() {
		String custString;

		//update this string so that it contains the street, city, province, and postal code
		custString = firstName + " " + lastName + " " + street + " " + city + " " + province + " " + postalCode + "\n";
	 	return(custString);
	}

}
