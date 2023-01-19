public class ReverseNum {
    public static void main(String[] args){
        int n=123456;
        int p=0;
        while(n>0){
            int rem=n%10;
            n/=10;
            p=p*10+rem;
        }
        System.out.println(p);
    }
}
