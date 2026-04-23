package arrays;

public class LongPrefix {
    public static String longestPrefix(String[] strs){
        if (strs == null || strs.length == 0) return "";

        String first = strs[0];

        for(int i = 0; i < first.length(); i++){
            char ch = first.charAt(i);

            for(int j = 1; j < strs.length; j++){
                if(i > strs[j].length() || strs[j].charAt(i) != ch){
                    return first.substring(0,i);
                }
            }
        }
    return first;
    }

    // Another way for longest prefix
    public static String prefix(String[] strs){

        String prefix = strs[0];

        for(int i = 1; i < strs.length;i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args){

        String[] strs = {"flo","flo","flower"};
        System.out.println(longestPrefix(strs));

    }
}
