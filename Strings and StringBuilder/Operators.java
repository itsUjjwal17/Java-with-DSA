
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b'); //converting the characters itno its ascii values and then adding them
        System.out.println("a"+"b"); //concatenate both strings //operator overloading
        System.out.println('a'+3); //returns 100
        System.out.println((char)'a'+3); //converting ascii value to character
        System.out.println("a"+1); //this also concatenate
        //this is same as after a few steps: "a"+"1"
        //integer will be Integer(wrapper class) that will call toString

        System.out.println("Ujjwal"+new ArrayList<>()); //returns Ujjwal[] //string with an empty array
        System.out.println("Ujjwal"+new Integer(69));

        // System.out.println(new Integer(69)+new ArrayList<>()); //"+" is only defined for primitives and we can use this with these only when then there is a String type
        System.out.println(new Integer(69)+" "+new ArrayList<>()); //now it'll work

        // System.out.println("a"-"b"); //this will not work 
        System.out.println("a"+'b'); //addition of string with anything, result becomes string
    }
}
