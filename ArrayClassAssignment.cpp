//This program is made to implement a one dimensional array data structure
//using the different functions

#include "pch.h"
#include <iostream>
#include <string>
#include <cmath>
#include <iomanip>
#include <fstream>
#include <cstdlib>
#include <vector>


void emptyFull(int arraySize,int elementNum) {
	int emptyElement;
	emptyElement = arraySize - elementNum;
	if (emptyElement >= 1) {
		cout << "There is ";
		cout << emptyElement;
		cout << " empty space(s) in the array." << endl;
	}
	else if (emptyElement == 0) {
		cout << "The array is full." << endl;
	}
	else {
		cout << "The array is empty." << endl;
	}
}

//-------------------------------------------------------------------------------------------

void size(int arraySize) 
{// start of size
	cout << "The size of the array is: " << endl;
	cout << arraySize;
}//end of size

//-------------------------------------------------------------------------------------------

void at(int arraySize,vector<int> array)
{//start of at
	int arrayIndex;	// the specific array index to find the element value at

	cout << "Enter array index, to return value." << endl;
	cin >> arrayIndex;

	if (arrayIndex < 0)
	{//start of if
		cout << "This index does not exist." << endl;
		exit(EXIT_FAILURE);
	}//end of if

	if (arrayIndex > arraySize)
	{//start of if
		cout << "This index it bigger than the capacity of the array, therefore it does not exist." << endl;
		exit(EXIT_FAILURE);
	}//end of if

	else
	{//start of else
		cout << "The element at index" << arrayIndex << "is: " << endl;
		cout << array.at(arrayIndex) << endl;
	}//end of else

}//end of at

//-------------------------------------------------------------------------------------------

void insertFront(vector<int> array)
{//start of insertFront
	int elementFront;	//new value for the element beiong inserted at the front of the array
	
	cout << "Enter the value of the element you would like to insert at the front of the array.\n" << endl;
	cin >> elementFront;

	cout << "This is the current array: " << endl;
	// current array
	for (unsigned int i = 0; i < array.size(); i++)
	{//start of for loop
		cout << array[i] << " ";
	}//end of for loop

	cout << "\n\nThis is the array with the new element added at the front: " << endl;

	// adding element to front of the array
	array.insert(array.begin(), elementFront);

	// printing array with new element added in the begginging
	for (unsigned int i = 0; i < array.size(); i++) 
	{//start of for loop
		cout << array[i] << " ";
	}//end of for loop
}//end of insertFront

//-------------------------------------------------------------------------------------------

void insertEnd(vector<int> array,int arraySize,int elementNum)
{//start of insertEnd

	int newElementEnd;	//new element being addede to the end oif the array
	
	cout << "What is the value of the new element you would like to add?" << endl;
	cin >> newElementEnd;

	// testing to see if there is space to add an element at the end
	if (elementNum >= arraySize)
	{ //start of if
		cout << "The array is full, you cannnot add anymore elemenets.\n" << "The size of the array is: \n";
		cout << arraySize;
	}// end of if

	else 
	{//start of else
		// adding element to the end
		array.insert(array.begin() + arraySize, newElementEnd);

		// printing array with new element at end
		for (unsigned int i = 0; i < array.size(); i++) 
		{//start of for loop
			cout << array[i] << " ";
		}//end of for loop
	}//end of else

}//end of insertEnd

//-------------------------------------------------------------------------------------------

void insertLocation(vector<int> array, int arraySize) 
{//start of insertLocation
	
	int newElement;	//new element to be inserted
	int insertLocationIndex;	//index where to insert new element
	
	cout << "What is the value of the new element you would like to add?" << endl;
	cin >> newElement;

	cout << "Where in the array would you like to insert, enter an index (remeber the first index in array is 0)." << endl;
	cin >> insertLocationIndex;

	// testing that the index is not bigger than the size of array
	if (insertLocationIndex > arraySize) 
	{//start of if
		cout << "This index does not exist." << endl;
		exit(EXIT_FAILURE);
	}//end of if

	// testing to make sure the index is not less than zero
	if (insertLocationIndex < 0) 
	{//start of if
		cout << "This index does not exist." << endl;
		exit(EXIT_FAILURE);
	}//end of if

	else 
	{//start of else

		// adding element to the desired location, starting from index zero
		array.insert(array.begin() + insertLocationIndex, newElement);

		for (unsigned int i = 0; i < array.size(); i++) 
		{//start of for loop
			cout << array[i] << " ";
		}//end of for loop
	}//start of else
}//end of insertLocation

//-------------------------------------------------------------------------------------------

void deleteFront(vector<int> array,int arraySize,int elementNum)
{//start of deleteFront

	int emptyElement;

	emptyElement = arraySize - elementNum;
	if (emptyElement = 0) {
		cout << "The array is empty" << endl;
	}
	else {
		// deletes the first element in the array with the "+1"		
		array.erase(array.begin() + 0);

		//prints array with first element deleted
		for (unsigned int i = 0; i < array.size(); i++) 
		{//start of for loop
			cout << array[i] << " ";
		}//end of for loop
	}
}//end of deleteFront

//-------------------------------------------------------------------------------------------

void deleteEnd(vector<int> array,int elementNum)
{//start of deleteEnd
	cout << "The new array with the last element deleted is: " << endl;

	// takes the largest index based off of the input from the orginial array
	array.erase(array.begin() + elementNum - 1);

	for (unsigned int i = 0; i < array.size(); i++) 
	{//start of for loop
		cout << array[i] << " ";
	}//end of for loop
}//end of deleteEnd

//-------------------------------------------------------------------------------------------

void deleteLocation(vector<int> array) 
{//start deleteLocation

	int indexDeleteLocation;	//specific index to be deleted

	cout << "This is the current array: " << endl;	//prints out the current array
	
	// printing oput current array
	for (unsigned int i = 0; i < array.size(); i++) 
	{//start of for loop
		cout << array[i] << " ";
	}//end of for loop

	cout << "" << endl;
	cout << "Enter the element's index that you want to delete." << endl;

	cin >> indexDeleteLocation;

	array.erase(array.begin() + indexDeleteLocation);	//deleteing the element in the array
	
	//printing out new array with the deleted element
	for (unsigned int i = 0; i < array.size(); i++) 
	{//start of for loop
		cout << array[i] << " ";
	}//end of for loop

}//end of deleteLocation

//-------------------------------------------------------------------------------------------

void clear(vector<int> array,int arraySize,int elementNum) 
{// start of clear

	cout << "This is the current array: " << endl;

	//prints out the current array
	for (unsigned int i = 0; i < array.size(); i++) 
	{//start of for loop
		cout << array[i] << " ";
	}//end of for loop

	cout << "" << endl;
	cout << "The array has been cleared." << endl;

	// clearing the array
	for (int i = 0; i <= elementNum; i++)
	{
		array.erase(array.begin() + i);
	}

	// printing cleared array
	for (unsigned int i = 0; i < array.size(); i++) 
	{//start of for loop
		cout << array[i] << " ";
	}//end of for loop

	// showing the size of the array after being cleared
	cout << "The number of elements in the array is: " << endl;
	cout << elementNum;
}//end of clear

//-------------------------------------------------------------------------------------------

int main()
{//start of main method
	vector<int> array;	// creating vector to keep track of elements for harray
	int menuOption;		// option to pick array functions
	int createArray;	// decides if array wil be created
	int arraySize;		// size of the array
	int elementNum;		// total number of elements in the array
	int element;		// specific element to be added to array

	cout << "Would you like to creat an array? '1 if yes' or '0 if no'" << endl;
	cin >> createArray;

	if (createArray = 1)
	{//start of if
		cout << "What capacity array would you like to make?" << endl;
		cin >> arraySize;

		cout << "How many elements would you like to add to the array?" << endl;
		cin >> elementNum;

		cout << "Please enter elements into the array\n" << endl;
		
		for (int i = 0; (i <= (elementNum - 1)); i++)
		{//start of for loop
			cout << "Enter element." << endl;
			cin >> element;
			array.push_back(elementNum);
		}//end of for loop

		cout << "//---------------------------------------------------------------------------------------------------------------------" << endl;

		//menu decides which function is wanted to see details about array, insert, delete, or clear array
		cout << "Choose options to see information, insert elements, delete elements, or clear the array." << endl;
		cout << "" << endl;

		// isEmpty and isFull
		cout << "To see if the array is empty or full enter '1'\n" << endl;

		// sizeArray
		cout << "To see the size of the array, enter '2'\n" << endl;

		// At
		cout << "To see the value of an element at a specific index, enter '3'\n" << endl;

		// insertFront
		cout << "To insert an element to the front of the array, enter '4'\n" << endl;

		// insertEnd
		cout << "To insert an element at the end of the array, enter '5'\n" << endl;

		// insertLocation
		cout << "To insert an element at a specific index, enter '6'\n" << endl;

		// deleteFront
		cout << "To delete an element at the front of the array, enter '7'\n" << endl;

		// deleteEnd
		cout << "To delete an element at the end of the array, enter '8'\n" << endl;

		// deleteLocation
		cout << "To delete an element at a specific index, enter '9'\n" << endl;

		// clear
		cout << "To clear all the elements in the array, enter '10'\n" << endl;

		cin >> menuOption;

//--------------------------------------------------------------------------------------------------------------------------------------------

		if (menuOption == 1)
		{//start of if
			emptyFull(arraySize,elementNum);
		}//end of if

		if (menuOption == 2)
		{//start of if
			size(arraySize);
		}//end of if

		if (menuOption == 3)
		{//start of if
			at(arraySize,array);
		}//end of if

		if (menuOption == 4)
		{//start of if
			insertFront(array);
		}//end of if

		if (menuOption == 5)
		{//start of if
			insertEnd(array,arraySize,elementNum);
		}//end of if

		if (menuOption == 6)
		{//start of if
			insertLocation(array,arraySize);
		}//end of if

		if (menuOption == 7)
		{//start of if
			deleteFront(array,arraySize,elementNum);
		}//end of if

		if (menuOption == 8)
		{//start of if
			deleteEnd(array,elementNum);
		}//end of if

		if (menuOption == 9)
		{//start of if
			deleteLocation(array);
		}//end of if

		if (menuOption == 10)
		{//start of if
			clear(array,arraySize,elementNum);
		}//end of if


	}

	if (createArray = 0)
	{//start of if
		cout << "Thank you for using this program." << endl;
		return 0;
	}//end of if

}//end of main method

