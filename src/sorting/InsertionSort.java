package sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){
        for (int i=1; i < arr.length;i++){
            int current = arr[i];
            int j = i-1;
            while (j >=0 && current < arr[j]){
                int temp = arr[j+1];
                arr[j+1] = arr[j];
                arr[j] = temp;
                j--;
            }
            //arr[j+1] = current;
        }
    }

    public static void main(String[] args){
        int arr[] = {2,1,4,8,5,7,6,9};
        System.out.println("Before Sorting = "+ Arrays.toString(arr));

        insertionSort(arr);
        System.out.println("After Sorting = "+ Arrays.toString(arr));
    }
}
