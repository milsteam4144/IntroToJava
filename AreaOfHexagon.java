/****************************************
*
* Student Name: Mallory Milstead
* Date Due: 2/6/2020
* Date Submitted: 2/5/2020
* Program Name: Homework 2 Program 1
* Program Description: The program allows the user to enter the length of one side of a hexagon and then calculates & outputs the area.
*
*
****************************************/

import java.util.Scanner;

public class AreaOfHexagon {
	
	public static void main(String[] args){
		
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Get input from user
		System.out.println("Enter the length of one side of a hexagon: ");
		double sideLength = input.nextDouble();
		
		//Calculate the area
		double area = ((3*(Math.sqrt(3))) / 2) * Math.pow(sideLength, 2);
		
		//Output area to user
		System.out.printf("\nThe area of the hexagon is: %.3f %n " , area);
		
		//Close Scanner object
		input.close();
	}

}
