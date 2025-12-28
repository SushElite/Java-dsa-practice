package conditionals_and_loops;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

       int largestNumber = Integer.MIN_VALUE;
        boolean hasInput = false;

        while(true){
            int number = input.nextInt();

            if(number == 0){
                break;
            }
            hasInput = true;
            largestNumber = Math.max(largestNumber, number);
        }

        if(hasInput){
            System.out.println("The largest number is " + largestNumber);
        }
        else {
            System.out.println("no numbers were entered");
        }
        input.close();
    }
}
