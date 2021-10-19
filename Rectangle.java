public class Rectangle {

    //Instance variables
    private int length;
    private int width;
    private int perimeter;
    private int area;

    // Constructor
    public Rectangle (int length, int width){
        this.length = length;
        this.width = width;
        this.perimeter = (this.length * 2) + (2 * this.width);
        this.area = this.length * this.width;
    }

    //Method to compare the permimeter and area
    public static boolean compareTo(Rectangle a, Rectangle b){

        if (a.length == b.length && a.width == b.width){
            System.out.println("The rectangles' dimensions are equal");
            System.out.println("The perimeter is " + (a.perimeter));
            System.out.println("The area is " + (a.area));
            return true;
        }
        else{
            System.out.println("The rectangles' dimensions are not equal");

            if (a.perimeter > b.perimeter) {
                System.out.println("Rectangle A has a greater perimeter");
            }
            if (a.perimeter == b.perimeter){
                System.out.println("The perimeters are equal, but the dimensions are not");
            }
            else{
                System.out.println("Rectangle B has a greater perimeter");
            }
            return false;
        }
    }

    //Main Method
    public static void main(String[] args) {
        Rectangle A = new Rectangle(5, 10);
        Rectangle B = new Rectangle (5, 10);
        Rectangle C = new Rectangle (10, 5);

        //Call static method to compare the Rectangles
        System.out.println("Comparing rectangles A and B: ");
        compareTo(A, B);
        System.out.println("\n\n");
        System.out.println("Comparing rectangles B and C: ");
        compareTo(B, C);

    }



}


