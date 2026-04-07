package arrays;

import java.util.Arrays;
//This is prefixSum it takes value from array and add it into next element and give sum of given range
public class PrefixSum {
    public static int[] buildPrefix(int[] nums){
        int n = nums.length;
        int[] prefix = new int[n+1];
        for(int i = 1; i<=n; i++){
            prefix[i] = prefix[i-1] + nums[i-1];
        }
        return prefix;
    }
    public static int rangeSum(int[] prefix,int left, int right){
        return prefix[right+1] - prefix[left];
    }

    public static void main(String[] args){
            int[] nums = {10,20,5,30,20};  //{10,20,5,30,20}
            int[] prefix = buildPrefix(nums); //[0, 10, 30, 35, 65, 85]
            int sum = rangeSum(prefix,3,4); // 50 30+20

            System.out.println(sum);
            System.out.println(Arrays.toString(prefix));
    }

}

