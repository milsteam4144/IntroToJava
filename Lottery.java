/****************************************
 *
 * Student Name: Mallory Milstead
 * Date Due: 2/21/2020
 * Date Submitted: 2/19/2020
 * Program Name: CSC 1760 Homework #3 Game:Lottery
 * Program Description: User enters a three digit integer that is compared to a randomly generated number
 The user is awarded depending of how many of their integers match the randomly generated ones. I am assuming that
 if a user enters 533 and the winning number is 131, they only matched one integer (3)
 *
 *
 ****************************************/

import java.util.Scanner;

public class Lottery {
	
	public static void main(String[] args){
		
		System.out.println("Enter a 3 digit number to play the lottery!");
		Scanner input = new Scanner(System.in);
		int userNumber = input.nextInt();
		
		//If the user enters a number greater than three digits, use only the first three digits
		if (userNumber > 999){
			int firstThreeDigits = Integer.parseInt(Integer.toString(userNumber).substring(0, 3));
			//Test
			//System.out.println(firstThreeDigits);
			userNumber = firstThreeDigits;
			
		}
		int firstDigit = (userNumber/100)%10;
		int secondDigit = (userNumber/10)%10;
		int thirdDigit = userNumber%10;
		//Test
		//System.out.println(firstDigit + " and "+ secondDigit + " and " + thirdDigit);

		int lottoNum = (int)(Math.random()*900 + 100); //Generates values from 100-999

		System.out.println("The winning number is "+ lottoNum + "\nYour number is " + userNumber);
		
		int firstDigitLotto =(lottoNum/100)%10;
		int secondDigitLotto = (lottoNum/10)%10;
		int thirdDigitLotto = lottoNum%10;
		//Test
		//System.out.println(firstDigitLotto + " and "+ secondDigitLotto + " and " + thirdDigitLotto);
		
		if (userNumber == lottoNum){
			System.out.println("You matched all the numbers in exact order, you win $10,000!");
		}

		/*Need parenthesis around OR statements here because the AND statements take precedence and are executed first
		without them*/

				//This part is necessary when the random number has multiples of the same digit
		else if (((firstDigit == firstDigitLotto || firstDigit == secondDigitLotto || firstDigit == thirdDigitLotto) &&
				(secondDigit == firstDigitLotto || secondDigit == secondDigitLotto || secondDigit == thirdDigitLotto) &&
				(thirdDigit == firstDigitLotto || thirdDigit == secondDigitLotto || thirdDigit == thirdDigitLotto)) &&
				//This part is necessary when the user enters a number with multiples of the same digit
				((firstDigitLotto == firstDigit || firstDigitLotto == secondDigit || firstDigitLotto == thirdDigit) &&
				(secondDigitLotto == firstDigit || secondDigitLotto == secondDigit|| secondDigitLotto == thirdDigit) &&
				(thirdDigitLotto == firstDigit || thirdDigitLotto == secondDigit || thirdDigitLotto == thirdDigit))){
					System.out.println("You matched all the numbers, but not in exact order, you win $3,000!");
				}
		else if(firstDigitLotto == secondDigit || secondDigitLotto == firstDigit || firstDigitLotto == firstDigit ||
				firstDigitLotto == thirdDigit || secondDigitLotto == thirdDigit || secondDigitLotto == secondDigit ||
				thirdDigitLotto == thirdDigit || thirdDigitLotto == firstDigit ||
				thirdDigitLotto == secondDigit){
			System.out.println("You matched at least one number, but not all, you win $1,000!");
		}
		else{
			System.out.println("Sorry, You did not match any numbers.");
		}
		
		input.close();
	}

}
