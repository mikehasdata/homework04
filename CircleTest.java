import java.util.*;

public class CircleTest {


    public static void main(String[] args) {

        int x, y, radius;
        double average;
        final int FINAL_VALUE;

        x = (int) (Math.random()*25) + 1;
        y = (int) (Math.random()*25) + 1;

        FINAL_VALUE = 0;

        /** point objects complete */
        Point point1 = new Point(x,y);  
        Point point2 = new Point(FINAL_VALUE,FINAL_VALUE);


        /** "instantiate two circles with the keyboard and 
         * "point2 as the center"
         */
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a radius for the fixed point (0,0): ");
            radius = input.nextInt();

            Circle firstCircle = new Circle(point2, radius);
            Circle secondCircle = new Circle (point1, 10);

            // calculating average before printing
            average = (firstCircle.area() + secondCircle.area()) / 2; 

            System.out.println("Circle Summary: ");
            System.out.println(firstCircle.toString());
            System.out.println(secondCircle.toString());
            System.out.println();
            System.out.println("Checking for equality...");
            System.out.println(firstCircle.equals(secondCircle));
            System.out.println();
            System.out.println("The average area between the two are: ");
            System.out.println(average);


        }

    }


}
