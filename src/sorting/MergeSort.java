package sorting;

import java.util.Arrays;

public class MergeSort {
    
    public static void MS(int[] arr,int low, int high){
        
        if(low >= high){
            return;
        }
        int mid = low + (high - low) / 2;
        MS(arr, low, mid);
        MS(arr, mid + 1, high);
        
        merge(arr,low,mid,high);
    }
    
    public static void merge(int[] arr, int low, int mid, int high){
        int[] temp = new int[high - low + 1];
        int left = low;
        int right = mid+1;
        int k = 0;
        
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp[k++] = arr[left++];
            }else {
                temp[k++] = arr[right++];
            }
        }
        while(left <= mid){
            temp[k++] = arr[left++];
        }
        while(right <= high){
            temp[k++] = arr[right++];
        }

        for(int i =0; i < temp.length;i++){
            arr[low + i] = temp[i];
        }
    }
    public static void main(String[] args){
        int arr[] = {2,1,4,8,5,7,6,9};
        System.out.println("Before Sorting = "+ Arrays.toString(arr));

        MS(arr,0, arr.length-1);
        System.out.println("After Sorting = "+ Arrays.toString(arr));

    }
}
