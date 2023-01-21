public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(OrderAgnosticBS(arr, 10));
    }

    static int OrderAgnosticBS(int[] arr,int target){
        int start=0;
        int end=arr.length-1;

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
