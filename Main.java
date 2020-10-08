//Name: 
//Date: 

import java.util.Scanner; 

//this class is used to test Triangle
public class Main  
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		//ask for user input
		System.out.print("Enter side A ::  ");
		int a = keyboard.nextInt();

		System.out.print("Enter side B ::  ");
		int b = keyboard.nextInt();

		System.out.print("Enter side C ::  ");
		int c = keyboard.nextInt();

		Triangle test = new Triangle(a,b,c);
		System.out.println("Perimeter is: " + test.getPerimeter());
		System.out.print("Area is: " );

    //This will round the area
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
