package assignements.first_java;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        int length = str.length();

        int start = 0;
        int end = length - 1;

        while(start < end){
            if(str.charAt(start) == str.charAt(end)){
                start++;
                end--;
            }
            else {
                break;
            }

        }

        if(start >= end){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
