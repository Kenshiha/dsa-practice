public class test {

    public int test(){
        System.out.println("What will be printed");
        return 0;
    }
    public int math(int a, int b){
        int x ;
        int y ;
        int c = a+b;
        return c;
    }
    public static void main(String[] args){

        test obj = new test();
        obj.test();
        int d = obj.math(5,4);
        System.out.println(d);
        System.out.println("what");
    }

}
