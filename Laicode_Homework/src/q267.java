import java.util.*;
public class q267 {
    public static  int[] search(int[][] matrix, int target){
        int[] cor = new int[]{-1,-1};
        if(matrix==null||matrix.length==0||matrix[0].length==0 ){
            return cor;
        }
        int[] color2 = new int[]{0,0};
        if(matrix[0][0] == target){
            return color2;
        }
        int len = matrix.length*matrix[0].length;
        for(int i=1; i<=len-1;i++){
            int row = i/matrix[0].length;
            int col = i%matrix[0].length;
            if(matrix[row][col]==target){
                color2[0]= row;
                color2[1]=col;
                return color2;
            }

        }
        return color2;

    }

    public static void main(String[] args){
        int[][] input = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.toString(search(input, 0)));
    }
}


