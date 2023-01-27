import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="Ujjwal Krishna";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name); //original one will not change cuz its immutable
    }
}
