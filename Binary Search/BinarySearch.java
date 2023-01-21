
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,0,11,24,34,57,75};
        System.out.println(binarySearch(arr, 76));
    }
    //return the index
    //return -1 if no exist
    static int binarySearch(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
         while(start<=end){
            //find the middle element
            // int mid=(start+end)/2; //might be possible that (start+end) exceeds the range of int //may give error
            int mid=start+(end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }else{
                //ans found
                return mid;
            }
         }
         return -1;
    }
}