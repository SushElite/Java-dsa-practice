package conditionals_and_loops;

import java.util.Scanner;


public class Isosceles {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base of  a triangle: ");
        double base = input.nextDouble();
        System.out.print("Enter the length of a equal side of a triangle: ");
        double length = input.nextDouble();

        if (length <= 0 || base <= 0 || 2* length <= base){
            System.out.println("The triangle is not an isoceles");
            return;
        }

        double height = Math.sqrt(length*length - (base*base/4));

        System.out.println("Height is " + height);
        double area = (base*height)/2;

        System.out.print("Area of Isosceles triangle ::" +  area);

        input.close();
        
    }
}