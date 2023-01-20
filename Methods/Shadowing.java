public class Shadowing {
    static int x=69; //this will be shadowed in line 6
    public static void main(String[] args) {
        System.out.println(x);
        int x=96; //the class variable at line 2 is shadowed by this
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
