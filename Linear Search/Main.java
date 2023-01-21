import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = { 23, 43, 1, 2, 3, 4, 5, -12, -332 };
        int target = 6;
        int ans = LinearSearch(nums, target);
        System.out.println(ans);

    }

    // search in the array: return the index if ite found
    // otherwise if itm not found return -1

    static int LinearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE; //constants
        }

        // run for a loop
        for (int index = 0; index < arr.length; index++) {
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