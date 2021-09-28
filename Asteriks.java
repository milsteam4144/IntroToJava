//Mallory Milstead - Defining Recursion CSC2850-002 - Problem 3.4

import java.util.Scanner;

public class Asteriks {
    // Argument n is the number of lines that will be printed
    public static String printTriangleUp(int n)
    {
        String drawing = "";

        if (n > 0) {

            //Call the method recursively and add the returned string to the drawing String object.
            drawing = printTriangleUp(n - 1);
            drawing = drawing + "*";
            System.out.println(drawing);
            return drawing;
        }
        //If n <= 0, return a blank string. This will happen then the recursive call in the if statement is terminated
        // or if the argument num is zero or negative
        return "";
    }


    public static void main (String[] args){
        System.out.println("Enter a positive interger to draw the triangle: ");
        Scanner myInput = new Scanner(System.in);
        //Get input from user
        int num = myInput.nextInt();
        //Call the method
        printTriangleUp(num);
    }
}
