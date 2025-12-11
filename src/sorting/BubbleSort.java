package sorting;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {10,2,7,4,6,5,3,9};
        System.out.println("Before Sort = "+ Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("After Sortng = "+Arrays.toString(arr));
    }
}
