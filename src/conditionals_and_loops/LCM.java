package conditionals_and_loops;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a =  input.nextInt();
        int b = input.nextInt();

        if(a == 0 && b == 0){
            System.out.println("LCM is undefined");
            return;
        }

        if (a == 0 || b == 0) {
            System.out.println("The LCM is: 0");
            return;
        }

        a = Math.abs(a);
        b = Math.abs(b);

        int firstNumber = Math.min(a,b);
        int secondNumber = Math.max(a,b);


        while(firstNumber != 0){
            int temp = firstNumber;
            firstNumber = secondNumber % firstNumber;
            secondNumber = temp;
        }

        int hcf = secondNumber;

        int lcm = a*b/ hcf;

        System.out.println("The LCM is: " + lcm);

    }
}
