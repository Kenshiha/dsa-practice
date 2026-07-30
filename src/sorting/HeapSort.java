package sorting;

public class HeapSort {
    int[] heap;
    int capacity;
    int size;

   HeapSort(int capacity){
       this.capacity = capacity;
       size = 0;
       heap = new int[capacity];
   }

   public void insert(int val){
       if(size >= capacity){
           throw new IndexOutOfBoundsException();
       }
       heap[size++] = val;
   }

   public void heapSort(){
       if(size <= 0){
           return;
       }

       int n = size;

       for(int i = (n/2) - 1; i >= 0; i--){
           heapifyDown(heap,n,i);
       }

       while(size != 0){
           swap(heap, 0, size-1);
           size--;
           heapifyDown(heap, size, 0);
       }
   }

   public void heapifyDown(int[] heap, int n,int i){
       int largest = i;
       int left = 2 * i + 1;
       int right = 2 * i + 2;

       if(left < n && heap[left] > heap[largest]){
           largest = left;
       }
       if(right < n && heap[right] > heap[largest]){
           largest = right;
       }

       if(largest != i){
//           int temp = heap[i];
//           heap[i] = heap[largest];
//           heap[largest] = temp;
           swap(heap,i,largest);
           heapifyDown(heap,n,largest);
       }
   }

   private void swap(int[] heap,int i, int j){
       int temp = heap[i];
       heap[i] = heap[j];
       heap[j] = temp;
   }

   public void display(){
       for(int i = 0; i < capacity; i++){
           System.out.print(heap[i] + ",");
       }
   }

    public static void main(String[] args){

       HeapSort heap = new HeapSort(8);

       heap.insert(10);
       heap.insert(20);
       heap.insert(30);
       heap.insert(40);
       heap.insert(50);
       heap.insert(60);

       heap.heapSort();
       heap.display();
    }
}
