//This class is used to convert different units of mass, using the scanner class,
//and methods outside of the main method

import java.util.*;
import java.util.Scanner;

public class weightConversion
{//start of class

	public static void main(String[] args)
	{//start of main method

		double slug=0,kilogram=0,gram=0;
		String startingUnit,convertedUnits,s,k,g;
		Scanner input = new Scanner(System.in);

		// reciving input from the user
		System.out.println("Please enter the starting unit of mass ('slugs', 'kilograms', and 'grams')");
		startingUnit = input.nextLine();	//takes input from the user

		System.out.println("Please enter the desired unit to convert to. 'slugs', 'kilogram', 'grams'");
		convertedUnits = input.nextLine();	//takes input from the user

		if(convertedUnits.equals("slugs"))
		{// start of if

			System.out.println("Please enter the mass in slugs.");
			s = input.nextLine();	//takes input from the user
			slug = Double.parseDouble(s);	//converts from a string to a double

			if(startingUnit.equals("kilograms"))
			{// start of if
				System.out.println(kilogramsToSlugs(slug));	//calling and printing the conversion method to convert kilograms to slugs
			}//end of if

			if(startingUnit.equals("grams"))
			{// start of if
				System.out.println(gramsToSlugs(slug));	//calling and printing the conversion method to convert from grams to slugs
			}//end of if
		}//end of if

		if(convertedUnits.equals("kilograms"))
		{// start of if

			System.out.println("Please enter the mass in kilograms.");
			k =  input.nextLine();	//takes input from the user
			kilogram = Double.parseDouble(k);	//converts from a string to a double

			if(startingUnit.equals("grams"))
			{// start of if
				System.out.println(gramsToKilograms(kilogram));	//calling and printing the conversion method to convert from kilograms to grams
			}//end of if

			if(startingUnit.equals("slugs"))
			{// start of if
				System.out.println(slugsToKilograms(kilogram));	//calling and printing the conversion method to convert from kilograms to grams
			}//end of if
		}//end of if

		if(convertedUnits.equals("grams"))
		{// start of if

			System.out.println("Please enter the mass in grams");
			g = input.nextLine();	//takes input from the user
			gram = Double.parseDouble(g);	//converts from a string to a double

			if(startingUnit.equals("slugs"))
			{// start of if
				System.out.println(slugsToGrams(gram));	//calling snd printing the conversion method to convert grams to slugs
			}//end of if
			if(startingUnit.equals("kilograms"))
			{// start of if
				System.out.println(kilogramsToGrams(gram));	//calling and printing the conversion method to convert grams to kilograms
			}//end of if
		}//end of if
	}//end of main method


	//mass conversion methods
//---------------------------------------------------------------------------------------------------------------------

	public static double slugsToGrams(double slugs)
	{// start of slugsToGrams
		return(slugs*14593.903);
	}// end of slugsToGrams

//---------------------------------------------------------------------------------------------------------------------

	public static double slugsToKilograms(double slug)
	{// start of slugsToKilograms
		return(slug*14.5939);
	}// end of slugsToKilograms

//---------------------------------------------------------------------------------------------------------------------

	public static double gramsToSlugs(double gram)
	{// start of gramsToSlugs
		return(gram/14593.903);
	}// end of gramsToSlugs

//---------------------------------------------------------------------------------------------------------------------

	public static double gramsToKilograms(double gram)
	{// start of gramsToKilograms
		return(gram/1000);
	}// end of gramsToKilograms

//---------------------------------------------------------------------------------------------------------------------

	public static double kilogramsToSlugs(double kilogram)
	{// start of kilogramsToSlugs
		return(kilogram/14.594);
	}//end of kilogramsToSlugs

//---------------------------------------------------------------------------------------------------------------------

	public static double kilogramsToGrams(double kilogram)
	{// start of kilogramsToGrams
		return(kilogram*1000);
	}// end of kilogramsToGrams

//---------------------------------------------------------------------------------------------------------------------
}//end of class
