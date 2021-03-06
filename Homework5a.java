// Page 374, programming projects 7.2 and 7.3
 class Homework5a
{
	public static void main (String[] args)
	{
		Address school = new Address ("800 Lancaster Ave.", "Villanova", "PA", 19085);
		
		Address jHome = new Address ("21 Jump Street", "Lynchburg", "VA", 24551);
		
		Student john = new Student ("John", "Smith", jHome, school);
		
		Address mHome = new Address (" 123 Main Street", "Euclid", "OH", 44132);
		
		Student marsha = new Student ("Marsha", "Jones", mHome, school);
		
		System.out.println (john);
		System.out.println ();
		System.out.println (marsha);
	}
}

  class Student
{
	private String firstName, lastName;
	private Address homeAddress, schoolAddress;
	
 public Student ( String first, String last, Address home, Address school)
 {
	firstName = first;
	lastName = last;
	homeAddress = home;
	schoolAddress = school;
}

 public String toString()
{
	String result;
	
	result = firstName + " " + lastName + "\n";
	result += "Home Address:\n" + homeAddress + "\n";
	result += "School Address:\n" + schoolAddress;
	
	return result;
	}
}

  class Address
{
	private String streetAddress, city, state;
	private long zipCode;
	
 Address ( String street, String town, String st, long zip)
{
	streetAddress = street;
	city = town;
	state = st;
	zipCode = zip;
}

public String toString()
{
	String result;
	
	result = streetAddress + "\n";
	result += city + ", " + state +" " + zipCode;
	
	return result;
}
}

	class Grade
{
	private testgrade1, testgrade2, testgrade3;
	
	public Grade( int score1, int score2, int score3)
	{
	
	
	
	
	}
	
	public SetGrade( int TestNo, int Score)
	{
		if( TestNo == 1)
			testgrade1 = Score;
		if( TestNo == 2)
			testgrade2 = Score;
		if( TestNo == 3)
			testgrade3 = Score;
		}
	
	
}

