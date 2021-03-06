// write a program that cacluates 
// the surface area and volume
// volume = 4 / 3 * PI * radius^3
// surface = 4 * PI * radius^2 

import java.util.Scanner;

class Homework2c
{
	public static void main(String[] args)
	
	{
		int radius;
		float volume, surface;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.print (" Enter the value of the radius: ");
		radius = scan.nextInt();
		
		volume = (float) (4/3 * Math.PI * Math.pow( radius, 3));
		surface = (float) ( 4 * Math.PI * Math.pow( radius, 2));
		
		System.out.println ( " The volume of the sphere is: " + volume );
		System.out.println ( " The surface area of the sphere is: " + surface);
		
	}
}
