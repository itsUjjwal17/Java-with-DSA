public class DigitProduct {
    public static void main(String[] args) {
        int ans=numsum(5);
        System.out.println(ans);
        
    }
    static int numsum(int n){
        if(n%10==n){
            return n;
        }
        return numsum(n/10)*(n%10);
    
    }
}

