// converting hours, minutes, and seconds to all seconds
// 1 hour = 3600 seconds
// 1 minute = 60 seconds

import java.util.Scanner;

class Homework2a 
{

	public static void main (String[] args)
	{
		final int HourConvs = 3600, MinuteConvs = 60;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println (" Enter number of hours: ");
		System.out.flush();
		int Hour = scan.nextInt();
		
		System.out.println (" Enter number of minutes: ");
		System.out.flush();
		int Minute = scan.nextInt();
		
		System.out.println ( " Enter number of seconds: ");
		System.out.flush();
		int Second = scan.nextInt();
		
		int HourSec = HourConvs * Hour;
		int MinuteSec = MinuteConvs * Minute;
		int TotalSec = HourSec + MinuteSec + Second;
	
		System.out.println (" The total is: " + TotalSec + " seconds." );
	}
}