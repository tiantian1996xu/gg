import java.util.*;

public class q258 {
    public static int[] moveZero(int[] array){
    if(array == null || array.length<=1){
        return array;
    }
    int left=0, right=array.length-1;
    while(left<=right){
        if(array[left] != 0) {
            left++;
        }else if(array[right] == 0){
            right--;
        }else{
            swap(array, left, right);
        }
    }
    return array;
    }

    private static void swap(int[] array, int a, int b){
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
    public static void main(String[] args){
        int[] input = new int[]{1,2,0,4,0,1,2,0,0};
        System.out.println(Arrays.toString(moveZero(input)));
    }
}
