import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        // swap(arr,1,3);
        // System.out.println(Arrays.toString(arr));
        int[] arr = { 1, 5, 6, 7, 8,5};
        // System.out.println(max(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
    int start=0;
    int end=arr.length-1;

    while(start<end){
        //
        swap(arr,start, end);
        start++;
        end--;
    }}

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1]; // into=from
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }
}
