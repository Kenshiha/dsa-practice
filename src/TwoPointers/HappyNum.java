package TwoPointers;

public class HappyNum {

        public boolean isHappy(int n){
            int slow = n;
            int fast = n;

            do{
                slow = squreSum(slow);
                fast = squreSum(squreSum(fast));
            }while( slow != fast);

            return slow == 1;
        }

        public int squreSum(int n){
            int sum = 0;

            while(n > 0){
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            return sum;
        }
}
