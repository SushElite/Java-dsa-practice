package assignements.first_java;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        float principal = input.nextFloat();
        System.out.print("Enter the tenure: ");
        float time = input.nextFloat();
        System.out.print("Enter the interest rate: ");
        float rate = input.nextFloat();


        float interest = (principal * rate * time)/100;

        System.out.println("The interest is " + interest);
    }
}
