
/****************************************
*
* Student Name: Mallory Milstead
* Date Due: 01/28/2020
* Date Submitted: 01/28/2020
* Program Name: SecondProgram
* Program Description: Calculates average kilometers ran per hour, given distance
* ran in miles and time ran in hours, minutes and seconds
*
****************************************/
import java.util.Scanner;

public class SecondProgram {
	public static void main(String[] args){
		
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		
		//Create variables
		final double mileToKM = 1.6;
		final double secondsInHour = 3600;
		
		
		//Get the number of miles ran
		System.out.println("How many miles were ran? ");
		double milesRan = input.nextDouble();
		
		//Get number of hours ran & convert to seconds
		System.out.println("How many hours did it take? ");
		double hourToSecs = input.nextDouble() * 60 * 60;
		
		//Get number of minutes & convert to seconds
		System.out.println("How many minutes did it take? ");
		double minsToSecs = input.nextDouble() * 60;
		
		//Get seconds
		System.out.println("How many seconds did it take? ");
		double seconds = input.nextDouble();
		
		//Calculate the total time ran in seconds
		double totalSeconds = hourToSecs + minsToSecs + seconds;
		
		/*Calculate the total time ran as a decimal number of an hour
		Divide total seconds ran by number of seconds in an hour*/
		double totalHours = totalSeconds/secondsInHour;
		
		//Convert number of miles ran to kilometers ran
		double kmRan = milesRan * mileToKM;
		
		/*Calculate the average number of kilometers ran per hour
		Divide number of km ran by number of hours ran*/
		double avgKmPerHour = kmRan / totalHours;
		
		//Output to screen
		System.out.println("\nAn average of " + avgKmPerHour + " kilometers were ran per hour.");
		
		//Check the math and output to screen
		System.out.println("\nTo check the math: A total of " + 
		(int)((avgKmPerHour * totalHours)/mileToKM) + " miles were ran.");
		
		//Close Scanner object
		input.close();
		
	}

}
