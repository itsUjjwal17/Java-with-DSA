import java.util.Scanner; //importing Scanner library from java utility
public class Inputs{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); //using sc as variable //taking input or scan input from System
        // int a=sc.nextInt(); //taking integer input
        // System.out.println(a);
        //Scanner is basically a class that specifies an input stream and using the object of that class and variable we can take input 
        
        String name=sc.next();
        System.out.println("My name is "+name);
    
    }
}
