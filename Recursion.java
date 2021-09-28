//Mallory Milstead - Defining Recursion CSC2850-002 - Problem 3.2

import java.util.Scanner;

public class Recursion {

    //Ensure the value is positive
    static boolean isPositive (int N) {
        if (N > 0) {
            return true;
        }
        else{
            System.out.println("Cannot use a value less than 1");
            return false;
        }
    }

    //Adds the sum of all positive numbers up to N
     static public int sum(int N){
        int counter = N-1;
        while (counter > 0){
            N += (N-(N-counter));
            counter--;
        }
        return N;
    }

    //Multiply N * 2
    static public int biPower(int N){
        return N + N;
    }

    //Multiply N * 5
    static public int timesFive(int N){
        return N + N + N + N + N;
    }

    //Main method to run the program
    public static void main(String[] args) {
        System.out.println("Enter a positive interger to perform recursive methods: ");
        Scanner myInput = new Scanner(System.in);
        int num = myInput.nextInt();
        if (isPositive(num)) {
            System.out.println("Sum(" + num + "): " + sum(num));
            System.out.println("BiPower(" + num + "): " + biPower(num));
            System.out.println("TimesFive(" + num + "): " + timesFive(num));
        }
    }
}



