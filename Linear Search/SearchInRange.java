public class SearchInRange {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        int m=LinearSearch(arr,8,1,4);
        System.out.println(m);
    }

    static int LinearSearch(int[] arr, int target,int start, int end) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE; //constants
        }

        // run for a loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it equals to the target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }
}
