import java.util.Arrays;
public class ChangeValue {
    public static void main(String[] args) {
        //create an array
        int[] arr={1,2,3,45,69};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0]=69; //if you make a change to the object via this ref variable, same object will be changed  
    }
}
