import java.util.Arrays;
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3},
            {3,2,1}
        };
        System.out.println(Arrays.toString(maximumWealth(arr)));
    }

    static int[] maximumWealth(int[][] accounts){
        int ans=0;
        for(int i=0;i<accounts.length;i++){
            int sum=0;
            for(int j=0;j<accounts[i].length;j++){
                sum+=accounts[i][j];
            }
            if(sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
