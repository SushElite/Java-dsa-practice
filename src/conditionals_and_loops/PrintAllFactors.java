package conditionals_and_loops;
import java.util.Scanner;
public class PrintAllFactors {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("0 has infinite factors");
            return;
        }

        number = Math.abs(number);

        for(int i = 1; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                System.out.print(i + " ");

                if(number / i != i){
                    System.out.print((number / i) + " ");
                }
            }

        }

        input.close();
    }
}
