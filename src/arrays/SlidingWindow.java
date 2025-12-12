package arrays;

public class SlidingWindow {

    public static int windowSum(int[] arr,int k){
        int n = arr.length;
        if (k > n)
            return -1;

        int sumWindow = 0;
        for (int i = 0;i < k;i++){
             sumWindow += arr[i];
        }
        int maxSum = sumWindow;

        for (int i = k; i<n;i++){
            sumWindow += arr[i] - arr[i-k];
            if (sumWindow > maxSum)
                maxSum = sumWindow;
        }
        return maxSum;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,5,5,6,0};
        int k = 3;

        int res = windowSum(arr,k);
        System.out.println(res);
    }
}
