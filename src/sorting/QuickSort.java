package sorting;

import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr,int start, int end){
      if(start < end ){
        int finalPiviot = partition(arr, start, end);

        quickSort(arr,start,finalPiviot-1);
        quickSort(arr,finalPiviot+1,end);
      }
    }
    public static int partition(int[] arr,int start, int end){
        int piviot = arr[end];
        int i = start - 1;

        for(int j = start; j < end; j++){
            if(arr[j] <= piviot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
              //  swap(arr,i,j);
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;
      //  swap(arr, i+1,end);
        return i+1;
    }

//    public static void swap(int[] arr, int i, int j){
//
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

    public static void main(String[] args){
        int[] arr = {11,2,23,10,5,8,15,9};
        System.out.println("Before Sorting = "+ Arrays.toString(arr));

        quickSort(arr,0, arr.length-1);
        System.out.println("After Sorting = "+Arrays.toString(arr));
    }
}
