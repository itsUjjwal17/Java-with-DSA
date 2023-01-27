public class Comparison {
    public static void main(String[] args) {
        String a="Ujjwal";
        String b="Ujjwal";
        System.out.println(a==b);

        String a1=new String("Ujj wal");
        String b1=new String("Ujjwal");
        System.out.println(a1==b1); //comparator
        System.out.println(a1.equals(b1)); //method //it totally focusses on onjects only
        
        System.out.println(a1.charAt(0));
    }    
}
