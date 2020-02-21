/****************************************
 *
 * Student Name: Mallory Milstead
 * Date Due: 2/21/2020
 * Date Submitted: 2/19/2020
 * Program Name: CSC 1760 Homework #3 Geometry: Point Position
 * Program Description: Calculates the position of a point (p2) relative to a line and outputs that
 information to the user
 *
 *
 ****************************************/

import java.util.Scanner;
public class PointPosition {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String textPosition = "";

        //Get input from user
        System.out.println("Enter the x coordinate for point 0: ");
        double point0_x = input.nextDouble();

        System.out.println("Enter the y coordinate for point 0 : ");
        double point0_y = input.nextDouble();

        System.out.println("Enter the x coordinate for point 1: ");
        double point1_x = input.nextDouble();

        System.out.println("Enter the y coordinate for point 1: ");
        double point1_y = input.nextDouble();

        System.out.println("Enter the x coordinate for point 2: ");
        double point2_x = input.nextDouble();

        System.out.println("Enter the y coordinate for point 2: ");
        double point2_y = input.nextDouble();

        //Calculate

        double position = (point1_x-point0_x) * (point2_y - point0_y) - (point2_x - point0_x) * (point1_y - point0_y);

        if (position > 0){
            textPosition = "on the left side of the line";
        }
        else if (position < 0){
            textPosition = "on right side of the line";
        }
        else if (position == 0){
            textPosition = "on the line";
        }
        else{
            textPosition = "not able to be determined";
        }

        System.out.println("Point p2's position is " + textPosition);

    }
}
