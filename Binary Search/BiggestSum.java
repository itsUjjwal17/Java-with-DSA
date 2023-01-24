import java.util.Arrays;
public class BiggestSum {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(Arrays.toString(i));
        }
    }
    static int splitArray(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]!=arr[j]){
                    if((arr[i]+arr[j]>max)){
                        max=arr[i]+arr[j];
                    }
                }
                }
            }
        
        return max;
    }
}
