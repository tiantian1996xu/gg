public class q13 {
    public static long power(int a, int b){
        if(a==0 && b == 0){
            return 1;
        }
        if(a==0){
            return 0;
        }
        if(b==0){
            return 1;
        }
        return a*power(a,b-1);

    }

    public static void main(String[] args){
        System.out.println(power(10,1));
    }
}
