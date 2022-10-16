import java.util.*;
public class kCloset  {
    public static int[] kClosest(int[] array, int target, int k) {
        // Write your solution here
        if(array==null||array.length==0){
            return array;
        }
        if(k==0){
            return new int[0];
        }

        int left = largestSmallerEqual(array, target);
        int right = left+1;
        int[] result = new int[k];
        int i = 0;

        while(k>0){
        //for(int i = 0; i<k;i++){

            if(right>=array.length || (left>0 && (target - array[left] <= array[right] - target))){// left is the cloest one or right out of bound
                result[i] = array[left--];
            }else{
                result[i] =array[right++];
            }
            k--;
            i++;
        }
        return result;
    }


    private static int largestSmallerEqual(int[] array, int target){
        int left=0;
        int right = array.length - 1;
        while(left < right -1){
            int mid = left+(right - left)/2;
            if(array[mid] <= target){
                left = mid;
            }else{
                right = mid;
            }
        }
        if(array[right] <= target){
            return right;
        }
        if(array[left]<= target){
            return left;
        }
        return -1;

    }

    public static void main(String[] args){
        int[]input = new int[]{-3,-2};
        System.out.println(Arrays.toString(kClosest(input, 10,2)));
    }

}
