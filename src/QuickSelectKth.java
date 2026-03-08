
// FOR FINDING KTH SMALLEST ELEMENT
public class QuickSelectKth {

    public static int kthSmallest(int[] arr, int k){
        if (arr == null || arr.length == 0 || k < 0 || k > arr.length){
            throw new IllegalArgumentException("Invalid input");
        }
        int left = 0;
        int right = arr.length - 1;
        int targetIdx = k - 1;

        while(left <= right){
            int pivotIdx = partiton(arr, left, right);

            if (pivotIdx == targetIdx){
                return arr[pivotIdx];
            } else if (pivotIdx > targetIdx) {
                right = pivotIdx - 1;
            }else {
                left = pivotIdx + 1;
            }
        }
        throw new RuntimeException("Unexpected");
    }

    private static int partiton(int[] arr, int left, int right){
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++){
            if (arr[j] <= pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr, i+1,right);
        return i+1;
    }
    private static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


    public static void main(String[] args) {
        int[] arr = {30, 10, 40, 2, 50, 90, 30};

        System.out.println("1st smallest: " + kthSmallest(arr.clone(), 1)); // expect 1
        System.out.println("2nd smallest: " + kthSmallest(arr.clone(), 2)); // expect 1
        System.out.println("3rd smallest: " + kthSmallest(arr.clone(), 3)); // expect 2
        System.out.println("7th smallest: " + kthSmallest(arr.clone(), 7)); // expect 9
    }
}
