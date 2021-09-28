//Mallory Milstead - Defining Recursion CSC2850-002 - Problem 3.6

import java.util.Scanner;

public class Squares {

        public static void drawSquares(int side) {
            //If the side == 1,
            if (side == 1)
                //Draw a single asterisk
                System.out.println("*");
            //Recursive calling ends here if side == 1
            else {
                //The number of times to draw the line
                for(int i = 0; i < side; i++) {
                    //How many asterisks will be on that line
                    for(int j = 0; j < side; j++)
                        System.out.print("*");
                    //Go to next line
                    System.out.println();
                }
                //Recursively call the method, passing the next smaller integer to the method
                drawSquares(side - 1);
            }
        }

        public static void main(String[] args) {

            System.out.println("Enter a positive interger to perform recursive methods: ");
            Scanner myInput = new Scanner(System.in);
            int sides = myInput.nextInt();
            //Call the method, passing the input as the argument
            drawSquares(sides);

        }

    }
