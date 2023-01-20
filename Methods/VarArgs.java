import java.util.Arrays;
public class VarArgs {
    public static void main(String[] args) {
        // fun(12,3,45,6,6,7);
        multiple(6,9,"Ujjwal","Krishna","KrUzz");
        
    }
    static void multiple(int a, int b, String...v){
        System.out.println(Arrays.toString(v));
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
