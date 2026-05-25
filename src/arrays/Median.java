package arrays;

import java.util.Arrays;

public class Median {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {

            int i = 0;
            int j = 0;
            int k = 0;

            int[] result = new int[nums1.length + nums2.length];

            while(i < nums1.length && j < nums2.length){
                if(nums1[i] < nums2[j]){
                    result[k] = nums1[i];
                    i++;
                }
                else{
                    result[k] = nums2[j];
                    j++;
                }
                k++;
            }
            while(i < nums1.length){
                result[k] = nums1[i];
                i++;
                k++;
            }
            while(j < nums2.length){
                result[k] = nums2[j];
                j++;
                k++;
            }

            System.out.println(Arrays.toString(result));

            if(result.length % 2 == 0){
                int res = result.length / 2;
                System.out.println(res);
                double ans = (double) (result[res - 1] + result[res]) / 2;
                return ans;
            }
            else{
                int res = result.length / 2;
                System.out.println(res);
                return result[res];
            }

        }

        public static void main(String[] args){
            Median median = new Median();
            int[] arr1 = {1,3,6};
            int[] arr2 = {2,4,5};
            int[] arr3 = {1,3,5};
            int[] arr4 = {2,4};

            double result = median.findMedianSortedArrays(arr1,arr2);

            System.out.println(result);
            double result2 = median.findMedianSortedArrays(arr3,arr4);
            System.out.println(result2);
        }
    }

