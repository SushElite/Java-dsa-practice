package conditionals_and_loops;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintAllFactorsSorted {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number == 0) {
            System.out.println("0 has infinite factors");
            return;
        }

        number = Math.abs(number);
        ArrayList<Integer> factors = new ArrayList<Integer>();

        for(int i = 1; i <= Math.sqrt(number); i++){
            if(number % i == 0){
                System.out.print(i + " ");
                if(number / i != i){
                    factors.add(number/i);
                }
            }
        }

        for(int i = factors.size() - 1; i >= 0; i--){
            System.out.print(factors.get(i) + " ");
        }

        input.close();
    }
}
