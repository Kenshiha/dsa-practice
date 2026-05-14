package arrays;

import java.util.Arrays;

public class TwoSumII {

    public static int[] twoSum(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;

        while (left < right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                return new int[]{left+1,right+1};
            }
            else if(sum < target){
                left++;
            }
            else {
                right--;
            }
        }

        return new int[]{};
    }
    public static void main(String[] args){
        int arr[] = {1,2,5,7,8,9,10};
        int target = 7;
        int[] res = twoSum(arr,target);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}
