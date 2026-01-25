package conditionals_and_loops;
import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int reverse = 0;

        while(number >0){
            int reminder = number % 10;
            reverse = reverse * 10 + reminder;
            number = number / 10;
        }

        System.out.println(reverse);

    }
}
