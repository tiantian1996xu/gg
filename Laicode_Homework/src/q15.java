public class q15 {
    public static int firstOccur(int[] array, int target){
        if(array==null || array.length==0){
            return -1;
        }
        for(int i=0; i<=array.length; i++){
            if(array[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] input = new int[]{1,2,3,4};
        System.out.println(firstOccur(input,4));
    }
}
