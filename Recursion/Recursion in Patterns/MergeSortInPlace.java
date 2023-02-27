import java.util.Arrays;

public class MergeSortInPlace{
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        arr=mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void mergeSort(int[] arr, int s, int e) {
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(arr,s,mid);
        int[] right=mergeSort(arr, mid, e));

        return merge(left,right);
    }

    private static int[] merge(int[] left, int[] right){
        int[] mix=new int[left.length+ right.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<left.length && j<right.length){
            if(left[i]<right[j]){
                mix[k]=right[j];
                i++;
            }else{
                mix[k]=right[j];
                j++;
            }
            k++;
        }

        //it may be possible that one of the arrays is not complete
        //copy the remaining element
        while(i<left.length){
            mix[k]=left[i];
            i++;
            k++;
        }

        while(j<right.length){
            mix[k]=right[j];
            j++;
            k++;
        }

        return mix;
    }
}