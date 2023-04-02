package CodingChallenge;

import java.util.Arrays;

public class DivFiftyTenFive {
    public static void main(String[] args) {

        System.out.println(divFiftyTenFive(10, 5, 50)); // 1
    }

    private static int divFiftyTenFive (int a, int b, int c){

        int[] nums = {a, b, c};
        Arrays.sort(nums);

        int result = nums[2];

        for (int i = nums.length - 2; i >= 0; i--) {
            result /= nums[i];
        }
        return result ;
    }
}
