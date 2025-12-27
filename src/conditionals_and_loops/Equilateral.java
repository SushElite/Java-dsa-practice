package conditionals_and_loops;

import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the side of the triangle: ");
        double side = input.nextDouble();

        if (side <= 0){
            System.out.println("Please enter the valid size of a triangle");
            return;
        }

        double areaOfEquilateralTriangle = Math.sqrt(3)*side*side/4;

        System.out.println("Area of Equilateral Triangle is " + areaOfEquilateralTriangle);

        input.close();
    }
}
