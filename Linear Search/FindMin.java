import java.util.Arrays;
public class FindMin {
    private static final int MAX_VALUE = 0;
    public static void main(String[] args) {
        int[] arr={3,2,1,4,5,67,69};
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        if(arr.length==0){
            return MAX_VALUE;
        }
        int m=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<m){
                m=arr[i];
            }
        }
        return m;
    }
}
