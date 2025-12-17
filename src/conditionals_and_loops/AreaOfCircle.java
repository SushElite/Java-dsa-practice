package conditionals_and_loops;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = radius*radius*Math.PI;

        System.out.println("The area of the circle is "+area);
        input.close();
    }
}
