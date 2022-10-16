public class q16 {
    public static int lastOccur(int[] array, int target){
        if(array==null || array.length==0){
            return -1;
        }
        for(int i =array.length-1; i>0;i--){
            if(array[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] input = new int[]{1,2,3,4,5};
        System.out.println(lastOccur(input,1));
    }
}
