package assignements.first_java;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int start = input.nextInt();
        int end = input.nextInt();


        for (int i = start + 1; i < end; i++){

            int numOfDigits = 0;
            int num = i;

            while (num != 0){
                num  = num / 10;
                numOfDigits++;
            }

            // 153  = 1*1*1 + 5*5*5 + 3*3*3 = 153

            num = i;
            int pow_sum = 0;

            while (num != 0){
                int digit = num % 10;
                pow_sum = pow_sum + Math.powExact(digit, numOfDigits);
                num = num / 10;
            }

            if(pow_sum == i){
                System.out.println(i + " is an Armstrong number");
            }

//
        }
    }
}
