import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {

        public int rmDuplicates(int[] num){
            int i = 0;
            for (int j = 1;j< num.length;j++){
                if (num[i] != num[j]){
                    num[++i] = num[j];
                }
            }
            return i+1;
        }

        public static void main(String[] args) {
            int num[] = {2,2,3,3,4,5,7};

            Main obj = new Main();
            int res = obj.rmDuplicates(num);
            System.out.println(res);
            System.out.println(Arrays.toString(num));
        }
    }