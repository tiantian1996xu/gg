public class q14 {
        public static int binarySearch(int[] array, int target){
            for(int i=0; i<=array.length-1;i++){
                if(array[i]==target){
                    return i;
                }
            }
            return -1;
        }

        public static void main(String[] args){
            int[] array = new int[]{1,2,3,43,5};
            System.out.println(binarySearch(array,1));
        }




}
