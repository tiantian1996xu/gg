import java.util.*;

public class q9 {
    public static int[] mergeSort(int[] array){
        if(array==null || array.length <= 1){
            return array;
        }
        return mergeSort(array, 0, array.length-1);
    }

    private static int[] mergeSort(int[]array, int left, int right){
        if(left == right){
            return new int[]{array[left]};
        }
        int mid = left + (right-left)/2;
        int[] leftResult = mergeSort(array, left,mid);
        int[] rightResult = mergeSort(array, mid+1,right);
        return merge(leftResult, rightResult);
    }

    private static int[] merge(int[] leftResult, int[] rightResult){
        int[] result = new int[leftResult.length + rightResult.length];
        int leftIndex=0, rightIndex=0, resultIndex = 0;
        while(leftIndex < leftResult.length && rightIndex < rightResult.length){
            if(leftResult[leftIndex]<= rightResult[rightIndex]){
                result[resultIndex] = leftResult[leftIndex];
                leftIndex++;
            }else{
                result[resultIndex] = rightResult[rightIndex];
                rightIndex++;
            }
            resultIndex++;
        }
        while(leftIndex< leftResult.length){
            result[resultIndex] = leftResult[leftIndex];
            leftIndex++;
            resultIndex++;
        }

        while(rightIndex < rightResult.length){
            result[resultIndex] = rightResult[rightIndex];
            rightIndex++;
            resultIndex++;

        }
        return result;
    }


    public static void main(String[] args){
        int[] input = new int[]{3,5,1,2,4,8};
        System.out.println(Arrays.toString(mergeSort(input)));

    }
}
