//(c) A+ Computer Science
//www.apluscompsci.com
//Name - TD
//Date - 10/8/2020

/*
* This class sets up a triangle based on user inputs
* This program also calculates the area and perimeter of the given triangle
*/

import java.util.Scanner;
import java.lang.Math.*; 

public class Triangle
{
	private int sideA, sideB, sideC;    //Side length variables

//----- Set Up Triangle Sides -----//
	public Triangle(int a, int b, int c)
	{
    sideA = a;
    sideB = b;
    sideC = c;
	}

//----- Perimeter -----//
  /*
  * Use the formula perimeter = a + b + c
  * Return perimeter value
  */
	public int getPerimeter( )
	{
    int perimeter = sideA + sideB + sideC;
    return perimeter;
	}

//----- Area -----//
  /*
  * Use the formula ol √s*(s-a)(s-b)(s-c)
  * s is perimeter/2
  * Return area value
  */
	public double getArea( )
	{
    double s = getPerimeter( )/2.0;
    double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
		return area;
	}
}