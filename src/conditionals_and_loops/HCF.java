package conditionals_and_loops;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();

        firstNumber = Math.abs(firstNumber);
        secondNumber = Math.abs(secondNumber);

        if (firstNumber == 0 && secondNumber == 0) {
            System.out.println("HCF is undefined for 0 and 0");
            return;
        }

        int largestNumber = firstNumber;
        int smallestNumber = secondNumber;

        if(secondNumber > largestNumber){
            largestNumber = secondNumber;
            smallestNumber = firstNumber;
        }

        while(smallestNumber != 0){
            int temp = smallestNumber;
            smallestNumber = largestNumber % smallestNumber;
            largestNumber = temp;
        }

        System.out.println("HCF of two numbers is : " + largestNumber);

        input.close();

    }
}
