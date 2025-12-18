package conditionals_and_loops;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double area, base, height;

        System.out.println("Enter the base of the triangle");
        base = input.nextDouble();
        System.out.println("Enter the height of the triangle");
        height = input.nextDouble();

        area = (base * height) / 2;

        System.out.println("The area of the triangle is "+area);

        input.close();
    }
}
