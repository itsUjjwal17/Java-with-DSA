import java.util.Arrays;
public class InfinteArray {
    public static void main(String[] args) {
        
        int[] arr={2,3,4,5,6,7,8,9,10,11,12,14,15,16,18,19,21,23,35};
        int target=15;
        System.out.println(findingRange(arr,target));
    }
    static int findingRange(int[] arr,int target){
        //first find the range
        //first start with a box of size 2

        int start=0;
        int end=1;

        //condition for the target to lie in the range
         while(target>arr[end]){
            int temp=end+1;
            //double the box value
            //end=previous end+sizeofbox*2
            end=end+(end-start+1)*2;
            start=temp;
         }
         return infinite(arr,target,start,end);
    }
    static int infinite(int[] arr,int target, int start, int end){
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
