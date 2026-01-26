package ArrayQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class BuildArrayFromPermutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int length = input.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the elements in the array");
        for(int i = 0; i < length; i++){
            arr[i] = input.nextInt();
        }

        int[] output = buildArray(arr);

        System.out.println(Arrays.toString(output));
        input.close();

    }


    public static int[] buildArray(int[] nums) {
        int length = nums.length;

        int[] arr = new int[length];

        for(int i = 0; i < length; i++){
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

}
