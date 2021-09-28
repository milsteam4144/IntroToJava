//Mallory Milstead - Defining Recursion CSC2850-002 - Problem 3.5

import java.util.Scanner;

public class GCD {
    public static int getGCD(int m, int n) {
        //Once n == 0, the GCD (m) has been found
        if (n == 0)
            return m;
        //The variable n is now sent as the m argument to the method
        //The expression (m%n) is now sent as the argument n to the method
        //This essentially switches the values of the variables
        return getGCD(n, m % n);
    }

    public static void main(String[] args){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter the first positive value:");
        int num1 = myInput.nextInt();
        System.out.println("Enter the second positive value:");
        int num2 = myInput.nextInt();
        System.out.println(getGCD(num1, num2) + " is the greatest common denominator.");
    }
}
