public class Overloading {
    public static void main(String[] args) {
        fun(69);
        fun("Ujjwal");
    }
    static void fun(int a){
        System.out.println(a);
    }
    static void fun(String name){
        System.out.println(name);
    }
} /*two things to consider:
    1. either the number of argument should be different 
    2. type of type of argument should be different
    */