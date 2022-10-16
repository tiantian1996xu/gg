import java.util.*;

public class q4 {
    public static int[] solve(int[] array){
        if(array == null || array.length==0){
            return array;
        }

        for(int i = 0; i<=array.length-1;i++){
            int min_index = i;
            for(int j = i+1; j<=array.length-1;j++){
                if(array[j]<= array[min_index]){
                    min_index = j;
                }
            }
            if(min_index > i){
                int tem = array[i];
                array[i] = array[min_index];
                array[min_index] = tem;
            }
        }
        return array;
    }

    public static void main(String[] args){
        int[] input = new int[]{5,4,3,2,1};
        System.out.println(Arrays.toString(solve(input)));
    }
}
