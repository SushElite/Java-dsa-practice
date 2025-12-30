package conditionals_and_loops;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int length = str.length();

        StringBuilder reverse = new StringBuilder();

        for(int i = length - 1; i >= 0; i--){
            reverse.append(str.charAt(i));
        }
        System.out.println(reverse);

        input.close();
    }
}
