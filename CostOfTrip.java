/****************************************
*
* Student Name: Mallory Milstead
* Date Due: 2/6/2020
* Date Submitted: 2/5/2020
* Program Name: Homework 2 Program 2
* Program Description: The program allows the user to enter a distance to drive (in miles), vehicle fuel efficiency (MPG),
*	price of fuel (per gallon) and displays the cost of a trip.
*
****************************************/

import java.util.Scanner;

public class CostOfTrip {
	
	public static void main(String[] args){
		
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Get input from user
		System.out.println("Enter the distane to drive (in miles): ");
		double milesToDrive = input.nextDouble();
		
		System.out.println("Enter number of miles the car can travel on one gallon of fuel (MPG): ");
		double mpg = input.nextDouble();
		
		System.out.println("Enter the price for a gallon of fuel: ");
		double pricePerGal = input.nextDouble();
		
		//Calculate the cost of a trip based on the input
		double tripCost = (milesToDrive/mpg) * pricePerGal;
		
		//Output cost to user
		System.out.printf("\nThe trip will cost: $ %.2f %n " , tripCost);
		
		//Close Scanner object
		input.close();
	}

}