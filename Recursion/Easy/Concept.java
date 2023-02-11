public class Concept {
    public static void main(String[] args) {
        fun(5);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        // fun(n--); //infinite loop // pass the value of n first then subtract it i.e. passing original value only
        fun(--n); //subtract first then pass
    }
}
