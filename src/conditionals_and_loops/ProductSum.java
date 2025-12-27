package conditionals_and_loops;

import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer::");
        int number = input.nextInt();

        if(number == 0){
            System.out.println("The difference is " + 0);
            return;
        }

        int sumOfDigits = 0;
        int productOfDigit = 1;

        int temp = number;
        while (temp != 0) {
            int digit =  temp%10;
            sumOfDigits = sumOfDigits + digit;
            productOfDigit = productOfDigit*digit;
            temp = temp/10;
        }

        int difference = productOfDigit-sumOfDigits;
        System.out.println("The difference is " + difference);
        input.close();

    }
}
