public class RotatedElement {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int[] arr1={0,1,2,4,5,6,7};
        System.out.println(RotationCount(arr1));
    }
    static int RotationCount(int[] arr){
        int pivot=findpivot(arr);
        return pivot+1;
    }
    //for non-duplicates elements
    static int findpivot(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            //4 cases over here
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }if(arr[mid]<=arr[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    //for duplicates elements
    static int findpivotWithDuplicates(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            //4 cases over here
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            //if elements at middle,start and end are equal then just skip the duplicates
            if(arr[mid]==arr[start] && arr[mid]==arr[end]){
                //skip the duplicates
                //note:what if these elements at start and end were the pivots??
                //check if start is pivot
                if(arr[start]>arr[start+1]){
                    return start;
                }
                start++;

                //check whether end is pivot
                if(arr[end]<arr[end-1]){
                    return end-1;
                }end--;
            }
            //left side is sorted, so pivot should be in right
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[mid]>arr[end])){
                start=mid+1;
            } else{
                end=mid-1;
            }
        }
        return -1;
    }
}


