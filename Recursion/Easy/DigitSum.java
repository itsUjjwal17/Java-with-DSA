public class DigitSum {
    public static void main(String[] args) {
        int ans=numsum(13579);
        System.out.println(ans);
        
    }
    static int numsum(int n){
        if(n<=1){
            return 1;
        }
        return numsum(n/10)+(n%10);
    }
}

