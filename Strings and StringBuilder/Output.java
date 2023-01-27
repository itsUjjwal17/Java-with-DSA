import java.util.Arrays;

public class Output {
    public static void main(String[] args) {
        // System.out.println(56);
        System.out.println(new int[]{2,3,4,5});
        System.out.println(Arrays.toString(new int[]{2,3,4,5})); //data overriding can be seen int his class for above line
        //coz we r telling compiler to use my toString method to print 
    }
}
