public class test {
   private int a;
   private int b;
    public int test(){
        System.out.println("What will be printed");
        return 0;
    }
    public int math(int x, int y){
        this.a = x;
        this.b = y;
        int c = a+b;
        return c;
    }

    public int bst(int[] nums, int target){

        int left = 0;
        int right = nums.length - 1;

        while(left < right){
            int middle = left + (right - left)/2;

            if(nums[middle] == target){
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            }else{
                right = right + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        test obj = new test();
        obj.test();
        int d = obj.math(5,4);
        System.out.println(d);

    }

}
