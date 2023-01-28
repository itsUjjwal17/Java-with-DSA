import java.net.SocketTimeoutException;
import java.util.Arrays;

import javax.imageio.spi.RegisterableService;
import javax.swing.plaf.synth.Region;

public class Methods {
    public static void main(String[] args) {
        String name="Ujjwal Krishna";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name); //original one will not change cuz its immutable

        System.out.println(name.indexOf('a'));

        System.out.println("     Ujjwal   ".strip());
        System.out.println(Arrays.toString(name.split(" "))); //cuts wherever it find space
    }
}
