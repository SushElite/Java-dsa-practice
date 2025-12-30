package functions;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if(((num & 1) == 0)){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }

        input.close();
    }
}
