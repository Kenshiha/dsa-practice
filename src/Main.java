import java.util.Arrays;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {

        public static int[] nextGreater(int[] nums){
            int n = nums.length;
            int[] ans = new int[n];
            Stack<Integer> stack = new Stack<>();
            for (int i = n-1; i >= 0; i--){
                while(!stack.isEmpty() && nums[stack.peek()] < nums[i]){
                    stack.pop();
                }
                ans[i] = stack.isEmpty() ? -1 : nums[stack.peek()];
                stack.push(i);
            }
            return ans;
        }

        // not related to next greater
        public static int simpleHash(String input){
            int hash = 0;
            for(char c : input.toCharArray()){
                hash = hash * 31 + c;
            }
            return hash;
        }

        public static void main(String[] args) {
            int nums[] = {2,7,3,6,5,7};
            int[] res =  nextGreater(nums);
            System.out.println(Arrays.toString(nums));
            System.out.println(Arrays.toString(res));

            System.out.println(simpleHash("Hello World"));
            System.out.println(simpleHash("Hello"));
            System.out.println(simpleHash("Hello"));
            System.out.println(simpleHash("hello"));
        }
    }