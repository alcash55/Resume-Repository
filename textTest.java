//These classes are to write a text file,append the file, read from the text file
//and to manipulate the data of the text file.


import java.util.Scanner;
import java.io.*;

public class textTest
{
	public static void main(String[] args) throws IOException
	{//start of main method
		Scanner input = new Scanner(System.in);
		String answer;

		writeText.text();
		readText.read();

		System.out.println("Would you like to append the text file? ('yes' or 'no')");
		answer = input.nextLine();

		if(answer.equals("yes"))
		{
			appendText.append();
			readText.read();
		}


	}//end of main method
}

//-------------------------------------------------------------------------------------------------------------
class writeText
{ //start of class
	static Scanner input = new Scanner(System.in);

	static String fileName = "tragedy";	//name of the file being created and written to
	static String TDPTW;	//content inside the file if use says no
	static String answer;	//User entered answer from the scanner

	//string that will be read or appeanded
	static String Tragedy = "\"Did you ever hear the tragedy of Darth Plagueis The Wise?  \n" +
						"I thought not. It's not a story the Jedi would tell you.  \n" +
						"It's a Sith legend. Darth Plagueis was a Dark Lord of the Sith  \n" +
						"so powerful and so wise he could use the Force to influence the midichlorians  \n" +
						"to create life… He had such a knowledge of the dark side that he  \n" +
						"could even keep the ones he cared about from dying. The dark side of the Force \n" +
						"is a pathway to many abilities some consider to be unnatural. He became so powerful… \n" +
						"the only thing he was afraid of was losing his power, which eventually, of course, he did. \n" +
						"Unfortunately, he taught his apprentice everything he knew, \n" +
						"then his apprentice killed him in his sleep. Ironic. He could save others from death, \n" +
						"but not himself.";


	public static void text() throws IOException
	{//start of text

		FileWriter fWrite = new FileWriter(fileName,true);
		PrintWriter outputFile = new PrintWriter(fileName);

		System.out.println("Haven you ever heard of the Tragedy of Darth Plagius The Wise?  ('yes') or ('no')");	//prompting the user
		answer = input.nextLine();	//taking user input

		if(answer.equals("no"))
		{//start of if
			outputFile.println(Tragedy);
		}//end of if

		if(answer.equals("yes"))
		{//start of if
			outputFile.println("Execute order #66\n");
		}//end of if

		outputFile.close(); //closing the file
		System.out.println("\nData written to the file \n");
	}//end of text
}//end of class

//-------------------------------------------------------------------------------------------------------------

class appendText
{
	public static void append() throws IOException
	{
		Scanner kybrdinput = new Scanner(System.in);

		String fileName,answer;
		String seat = "Take a seat young Skywalker";
		String operation = "Hold on. This whole operation was your idea.";

		System.out.println("Please enter the file name");	//finding the correct file by user input
		fileName = kybrdinput.nextLine();	//file name from the user

		FileWriter fWrite = new FileWriter(fileName,true);
		PrintWriter outputFile = new PrintWriter(fileName);


		System.out.println("Would you like to execute order #66? ('yes' or 'no')");	//prompting the user
		answer = kybrdinput.nextLine();

		if(answer.equals("yes"))
		{//start of if
			outputFile.println(seat);
		}// end of if
		if(answer.equals("no"))
		{//start of if
			outputFile.println(operation);
		}//end of if

		outputFile.close();	//closing the file that was appended

		System.out.println("Data written to file");
	}
}

//-------------------------------------------------------------------------------------------------------------

class readText
{
	public static void read() throws IOException
	{
		Scanner kybrdInput = new Scanner(System.in);

		System.out.println("Enter the filename with the extension");	//finding the correct file by user input
		String fileName = kybrdInput.nextLine();	//file name from the user
		String jedi;

		File file = new File(fileName);
		Scanner inputFile = new Scanner(file);

		do //start of loop
		{
			jedi = inputFile.nextLine();
			System.out.println(jedi);
		}
		while (inputFile.hasNext()); //end of loop
		inputFile.close(); //closing the file
	}
}

