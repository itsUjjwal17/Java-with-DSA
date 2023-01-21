import java.util.Arrays;
public class Max {
    public static void main(String[] args) {
        int[] arr={1,5,6,7,8};
    System.out.println(max(arr));
    }
    private static void max(int[] arr, int start, int end) {
    }
    static int max(int[] arr){
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
