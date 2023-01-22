import java.util.Arrays;
public class MountainArray {
    public static void main(String[] args) {
        
    }
    int search(int[] arr, int target){
        int peak=findInMountainArray(arr);
        int firstTry=OrderAgnosticBS(arr, target,0,peak);
        if(firstTry!=-1){
            return firstTry;
        }
        //try to search in the 2nd half
        return OrderAgnosticBS(arr, target, peak+1, arr.length-1);
    }
    
    public int findInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        
        while(start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                //you are in dec part of array
                //this may be the ans, but look at left
                //this is why end !=mid-1
                end=mid;
            }else{
                //you are in asc part of array
                start=mid+1; //because we know that mid+1 element>mid element 
            }
        }
        return start;
    }

    static int OrderAgnosticBS(int[] arr,int target, int start, int end){
        start=0;
        end=arr.length-1;

        //find whether tha array is sorted in aascending or descending
        boolean isAsc=arr[start]<arr[end];

         while(start<=end){
            //find the middle element
            // int mid=(start+end)/2; //might be possible that (start+end) exceeds the range of int //may give error
            int mid=start+(end-start)/2;

            if(arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                end=mid-1;
                }
                else{
                start=mid+1;
            }}else{
                if(target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        
         return -1;
    }
}
