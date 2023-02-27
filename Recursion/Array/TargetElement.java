public class TargetElement {
    public static void main(String[] args) {
        int[] arr={1,2,4,6,77,84,3,2,32};
        System.out.println(index(arr,3,0));
    }
    static boolean target(int[] arr, int target, int index){
        //base condition
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || target(arr, target ,index+1);
    }
    static int index(int[] arr, int target, int index){
        //base condition
        if(index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }else{
            return index(arr,target,index+1);
        }
        
    }
}
