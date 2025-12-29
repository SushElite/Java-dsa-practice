package conditionals_and_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if(number < 0){
            System.out.println("Please enter a positive integer");
            return;
        }

        int factorial = 1;

        if(number == 0){
            System.out.println(factorial);
            return;
        }

        for(int i = 1; i <= number; i++){
            factorial = factorial * i;
        }
        System.out.println(factorial);

        input.close();

    }
}
