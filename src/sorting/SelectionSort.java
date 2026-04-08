package sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr){

        for(int i  = 0; i< arr.length;i++ ){
            int small = i;
            for(int j = i+1;j< arr.length;j++){
                if(arr[small]>arr[j]){
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args){
        int arr[] =  {2, 5, 3, 7, 1, 9, 4};
        System.out.println("Before Sorting = "+ Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("After Sorting = "+Arrays.toString(arr));
    }
}
