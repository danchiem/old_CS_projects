// Write a program that reads the (x,y) coordinates for two points
// compute distance between 2 points using:
// distance = sqrt((x2 - x1)^2 + (y2 - y1)^2 (see the book)

	import java.util.Scanner;
	
	class Homework2b
{
	public static void main (String[] args)
	{ 
		int Xone, Yone, Xtwo, Ytwo; // points of the coordinates
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print ( " Enter value of X in first coordinate: " );
		Xone = scan.nextInt();
		
		System.out.print ( " Enter value of Y in first coordinate: " );
		Yone = scan.nextInt();
		
		System.out.print ( " Enter value of X in second coordinate: ");
		Xtwo = scan.nextInt();
		
		System.out.print ( " Enter value of Y in second coordinate: ");
		Ytwo = scan.nextInt();
		
		System.out.println ( " The value of the first point is: (" + Xone + "," + Yone + ")" );
		System.out.println ( " The value of the second point is: (" + Xtwo + "," + Ytwo + ")" );
		
		double xValue = Math.pow(Xtwo - Xone, 2);
		double yValue = Math.pow(Ytwo - Yone, 2);
		
		double Distance = Math.sqrt(xValue + yValue);
	
		
		System.out.println (" the distance between the two points is : " + Distance );
	
	
	}
}