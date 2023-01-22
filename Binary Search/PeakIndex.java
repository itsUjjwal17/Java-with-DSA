import java.util.Arrays;
public class PeakIndex {
    // private static final int MIN_VALUE = 0;
    // private static int i;
    public static void main(String[] args) {
        int[] arr={0,5,6,7,8,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
        
    }
    static int peakIndexInMountainArray(int[] arr) {
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
        //in the end, start ==end and pointing to the largest number because of the 2 checks above
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element, that is the max one because that is what the checks say
        //more elaboration at every point of tme start and end, they have the best poosible answer till that time
        //and if we are saying only one item is remaining, hence cuz of above line that is the best possible answer
        return start; //or end also(both are same)
    }
}
