import java.util.HashMap;
import java.util.Map;

public class Sum {

    public int[] twoSum(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i <= arr.length; i++){
            int ans = k - arr[i];
            if(map.containsKey(ans)){
                return new int[]{map.get(ans),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
    public static void main(String[] args){
        int arr[] = {1,2,4,5,6,7,8};
        int target = 10;

        Sum s = new Sum();
        int[] result = s.twoSum(arr, target);

        if (result.length == 2){
            System.out.println("Values = " + arr[result[0]] + " , " + arr[result[1]]);
        }else{
            System.out.println("No Pair Found");
        }

    }
}
