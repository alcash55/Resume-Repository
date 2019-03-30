//This class implements a for loop for traversasl of an array, implements methods beyond the main method,
//implements a double dimension array to be passed to a method for data input, then, a method for some kind
//of calculation on the double dimension array.

import java.util.*;
import java.util.Scanner;

public class programmingAssignment4
{
	public static void main(String[] args)
	    { // start of main method

		// Double dimension arrays. One for the dates of month, the other for temperatures.
	    int temperature_dates[][] = new int[10][10];
	    // single dimension array for calculation of F -> C
	    int tempF [] = new int [10];

		getTemp(temperature_dates);	//method that takes input from the user
		printTemps(temperature_dates);	//method that prints out the double dimensioned arrays
		convertTemps(temperature_dates,tempF);	//method that takes each temperature and converts it to celsius
	    traversal(temperature_dates);	//method for traversing the dates with the converted temperatures

	    } // end of main method

//-----------------------------------------------------------------------------

		public static void getTemp(int[][]temperature_dates)
		{
			String day_temp;
			int daysTemperature,i = 0,j = 1;

			System.out.println("Please enter the temperatures in FAHRENHIET for the first ten days of the month."); // prompts the user for temperatures

			for(i=0;i<10;i++)
			{ // start of loop
				Scanner input = new Scanner(System.in);
				day_temp = input.nextLine(); // takes the temperature input from the user
				daysTemperature = Integer.parseInt(day_temp); // converts from a sting to an integer to add to array
				System.out.println("");

				temperature_dates[i][0] = j ; // each day of the month
				temperature_dates[i][1] = daysTemperature;

				j++; // each increment adds the next day to the array
			} //end of loop
		}

//-----------------------------------------------------------------------------

		public static int[][] printTemps(int[][]temperature_dates)
		{ // start of printTemp
		int i=0,j=0;

		// prints all 10 temps
		System.out.println("");
		System.out.println("Dates:" + "\t" + "F:");
			for(i=0;i<10;i++)
			{ // start of loop
			System.out.println(temperature_dates[i][0]+"\t"+ temperature_dates[i][1]);

			} //end of loop
			return temperature_dates;
		} // end of printTemp

//-----------------------------------------------------------------------------

		public static void convertTemps(int[][]temperature_dates,int[]tempF)
		{
			int i=0,j,temp;

			System.out.println("");
			System.out.println("Dates:" + "\t" + "C:");
			// loop converts each temperature in fahrienheit to celsius
			for(i=0;i<10;i++)
			{ // start of loop
				temperature_dates[i][1] = (int)((((double)temperature_dates[i][1])-32.0)*(5.0/9.0)); // converts degrees to celsius as a int also casts from a double to an int
				System.out.println(temperature_dates[i][0]+"\t"+ temperature_dates[i][1]); // prints temps in celsius with dates
			} //end of loop
		}

//-----------------------------------------------------------------------------

	    public static void traversal(int[][]temperature_celcius)
	    { //start of traversal
			int i,j = 9;

			System.out.println("");
			System.out.println("Dates:" + "\t" + "C Traversed: ");
			for(i=0;i<10;i++)
			{ // start of loop

			System.out.println(temperature_celcius[j][0]+"\t"+temperature_celcius[j][1]); // traverses the celsius degrees with dates and prints them
			j--; // decrements for traversal

			} // end of loop
	    } // end of traversal

}// end of class






