public class Sorted{
    public static void main(String[] args) {
        int[] arr={1,2,3,5,6};
        System.out.println(array(arr, 0));
    }
    //array is sorted or not???
    static boolean array(int[] arr, int index){
        //base condition
        if(index==arr.length-1){
            return true;
        }
        return arr[index]<arr[index+1] && array(arr, index+1);
    }
}