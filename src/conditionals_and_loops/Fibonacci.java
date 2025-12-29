package conditionals_and_loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if(number <= 0){
            System.out.println("Invalid input");
            return;
        }


        System.out.print(0 + " ");

        if(number > 1){
            System.out.print(1 + " ");
        }

        int firstNumber = 0;
        int secondNumber = 1;

        for(int i = 3; i <= number; i++){
            int sum = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = sum;

            System.out.print(sum + " ");
        }

        input.close();

    }
}
