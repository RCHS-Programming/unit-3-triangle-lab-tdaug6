//Name: TD
//Date: 10/8/2020

/*
* This program takes user inputs to create a custom triangle
* This program also calls the functions in the Triangle.java file
* It will output the triangle's perimeter and area
*/

import java.util.Scanner; 

//this class is used to test Triangle
public class Main  
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

	//----- Get User Inputs -----//
    //Get side A
		System.out.print("Enter side A ::  ");
		int a = keyboard.nextInt();

    //Get side B
		System.out.print("Enter side B ::  ");
		int b = keyboard.nextInt();

    //Get side C
		System.out.print("Enter side C ::  ");
		int c = keyboard.nextInt();

  //----- Create Triangle -----//
    //Generate triangle with user inputs
		Triangle test = new Triangle(a,b,c);

    //Print out custom triangle perimeter
		System.out.println("Perimeter is: " + test.getPerimeter());

    //Print out custom triangle area to 5 decimal places
		System.out.print("Area is: " );
    System.out.printf("%.5f\n",test.getArea());

	}
}

/*

Sample Data :
3 3 3
7 8 9
10 9 11

Sample Output : 
Enter side A ::  3
Enter side B ::  3
Enter side C ::  3
Perimeter is 9
Area is 3.89711




Enter side A ::  7
Enter side B ::  8
Enter side C ::  9
Perimeter is 24
Area is 26.83282





Enter side A ::  10
Enter side B ::  9
Enter side C ::  11
Perimeter is 30
Area is 42.42641

*/
