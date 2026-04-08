package arrays;

import java.util.Arrays;

//This is Two Pointer method in array to remove duplicates

public class TwoPointer {

    public static int rmDuplicate(int[] arr){
        int i = 0;
        for(int j = 1 ; j < arr.length;j++){
            if (arr[i] != arr[j]){
                arr[++i] = arr[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,5,6,6,7};
        int res = rmDuplicate(arr);

        System.out.println(res);
        System.out.println(Arrays.toString(arr));
    }

}
