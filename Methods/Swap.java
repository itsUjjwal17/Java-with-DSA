public class Swap {
    public static void main(String[] args) {
        // int a=10;
        // int b=20;

        // //swap 2 numbers
        // int temp=a;
        // a=b;
        // b=temp;
        // swap(a,b);
        // System.out.println(a+" "+b);

        String name="Ujjwal";
        changeName(name);
        System.out.println(name);

    }
    static String changeName(naam){
        naam="Krishna";
    }

    static void swap(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        //this change wil only be valid in this fucntion scope only
    }
    
}
