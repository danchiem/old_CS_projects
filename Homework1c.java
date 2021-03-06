//Problem 3. Write an application program that converts miles to
//kilometers. 1 mile = 1.60935 kilometers. Read the miles value from
//the user as a floating point value. 

import java.util.Scanner;

class Homework1c
{
	final static float Kilo = 1.60935f;

	public static void main (String[] args )
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println ();
		System.out.println ( " Enter number of miles " );
		int mile = scan.nextInt();
		
		float answer = mile * Kilo;
		
		System.out.println ( "The total is " + answer + " Miles " );
		
		
		
	}
}