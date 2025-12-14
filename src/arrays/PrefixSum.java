package arrays;

import java.util.Arrays;

public class PrefixSum {
    public static int[] buildPrefix(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n+1];// Extra 0 at start
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + nums[i-1];  // Cumulative
        }
        return prefix;
    }

    public static int rangeSum(int[] prefix, int left, int right) {
        return prefix[right + 1] - prefix[left];  // Magic formula
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 10, 5, 15};
        int[] prefix = buildPrefix(nums);  // [0,10,30,40,45,60]
        System.out.println(rangeSum(prefix, 2, 3));// 35 (20+10+5)
        System.out.println(Arrays.toString(prefix));
    }
}

