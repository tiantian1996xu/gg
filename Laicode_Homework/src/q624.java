public class q624 {
    public static int fibonacci(int k){
        if(k<0) return 0;
        if(k==0) return 1;
        if(k==1) return 1;
        return fibonacci(k-2) + fibonacci(k-1);
    }
    public static void main(String[] args){
        System.out.println(fibonacci(10));
    }

}
