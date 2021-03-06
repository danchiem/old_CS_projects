/*design and implement an application that reads an arbirary 
number of intergers that are in the range 0 to 50 inclusive 
and counts how many occurrences of each are entered after 
all input has been processed, print all of the values 
with the numbers of occurrences taht were entered one or more times*/

import java.io.*;
import java.util.Scanner;

class Homework6a
{
	public static void main(String[] args) throws IOException {

		Scanner file = new Scanner ( new File ("data.txt"));
		
		int count;
		int[] array = new int[51];
		
		for ( int ID = 0; ID < array.length; ID++)
			array[ID] = 0;
			
		do 
		{
			count = file.nextInt();
			if (count >= 0 && count < 51)
			{
				array[count]++;
			}
			
			else
			{
				System.out.print ( "Input ingored.");
			}
		}
		
		while ( count != -1);
		{
			System.out.println();
			
			for (int ID = 0; ID < array.length; ID++) 
			{
				if (array[ID] != 0)
					System.out.println ( ID + " Appeared " + array[ID] + " Times in the list.");
			}
		}
}
}	
		
		