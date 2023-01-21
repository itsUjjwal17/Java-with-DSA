import java.util.Arrays;
public class SearchIn2DArray {
    private static final int MAX_VALUE = 0;
    public static void main(String[] args) {
        int[][] arr={
            {900,2,3},
            {4,5,6},
            {7,8,9,446,656,646,46,48}
        };
        // int target=48;
        // int[] ans=search(arr,target);
        // System.out.println(Arrays.toString(ans));
        System.out.println(MaxVal(arr));
    }

    static int MaxVal(int[][] arr){
        int m=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>m){
                    m=arr[row][col];
                }
            }
        }
        return m;
    }

    static int[] search(int[][] arr, int target){
        if(arr.length==0){
            return new int[]{-1,-1};
        }
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
