/****************************************
 *
 * Student Name: Mallory Milstead
 * Date Due: 2/21/2020
 * Date Submitted: 2/19/2020
 * Program Name: CSC 1760 Homework #3 Sort 3 Integers
 * Program Description: User inputs three integers. Display the integers back to the user in increasing order.
 *
 *
 ****************************************/


import java.util.Scanner;
public class IncreasingIntegers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int largestNum = 0;
        int middleNum = 0;
        int smallestNum = 0;

        System.out.println("Enter an integer: ");
        int num1 = input.nextInt();

        System.out.println("Enter a second integer: ");
        int num2 = input.nextInt();

        System.out.println("Enter a third integer: ");
        int num3 = input.nextInt();

        //Third number is largest
        if ((num3 > num1 && num3 > num2) || num3 == num1 || num3 == num2){
            if(num1 > num2){
                middleNum = num1;
                smallestNum = num2;
            }
            else{
                middleNum = num2;
                smallestNum = num1;
            }
            largestNum = num3;
        }
        //First number is largest
        else if ((num1 > num3 && num1 > num2) || num1 == num3 || num1 == num2){
            largestNum = num1;

            if(num2 > num3){
                middleNum = num2;
                smallestNum = num3;
            }
            else{
                middleNum = num3;
                smallestNum = num2;
            }

        }
        //Second number is largest
        else if((num2 > num3 && num2 > num1) || num2 == num3 || num2 == num1){
            largestNum = num2;
            if (num3 > num1){
                middleNum = num3;
                smallestNum = num1;
            }
            else{
                middleNum = num1;
                smallestNum = num3;
            }
        }
        else{
            smallestNum = num1;
            middleNum = num2;
            largestNum = num3;
        }

        System.out.println(smallestNum + ", " + middleNum + ", " + largestNum);

        input.close();

    }
}
