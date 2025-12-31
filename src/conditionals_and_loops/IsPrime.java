package conditionals_and_loops;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        if(number <= 1){
            System.out.println("Not Prime Number");
            return;
        }

        for(int i = 2; i*i <= number; i++){
            if(number % i == 0){
                System.out.println("Not Prime Number");
                return;
            }
        }

        System.out.println("Prime Number");
    }
}
