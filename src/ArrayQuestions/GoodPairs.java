package ArrayQuestions;

import java.util.Scanner;

public class GoodPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int [] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }

        int countOfGoodPairs = countGoodPairs(nums, n);

        System.out.println(countOfGoodPairs);

        input.close();
    }

    public  static int countGoodPairs(int[] nums, int n){
        int count = 0;
        int[] freq = new int[101];
        for(int i = 0; i < n; i++){
            count+=freq[nums[i]];
            freq[nums[i]]++;
        }
        return count;
    }


}
