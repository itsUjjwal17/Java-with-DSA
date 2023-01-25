import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 34, 234, 23, -5, 5, 34, -63,0, 6, 5, 4, 57 };
        Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void Sort(int[] arr){
        for(int i=0;i<arr.length;i++){
                      //find the max item in the remaining array and swap with its correct index
            int last =arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);

            swap(arr,maxIndex,last);
        }    
    }

    static void swap(int[] arr, int first, int end) {
        int temp = arr[first];
        arr[first] = arr[end];
        arr[end] = temp;
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }

        }
        return max;
    }
}
