package java_basics;

import java.util.Scanner;

public class EVEN_ODD_NUMBER {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if(number % 2 == 0){
            System.out.println(number + " is even");
            return;
        }

        System.out.println(number + " is odd");
    }
}
