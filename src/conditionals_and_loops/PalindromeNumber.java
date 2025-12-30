package conditionals_and_loops;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if(num < 0){
            System.out.println("false");
            input.close();
            return;
        }

        int reverse = 0;
        int original = num;

        while(num != 0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println(original == reverse);
        input.close();
    }
}
