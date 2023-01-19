import java.util.Scanner;
public class TypeCasting{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int num=sc.nextInt(); //asking for integer and giving float will not work but vice versa will work
        // System.out.println(num);

        //type casting
        int num =(int)(69.69f);// converting float into int
        System.out.println(num); //returns only 69 here
        //compressing the bigger no. into smaller type explicitly is known as typecasting

        //automatic type promotion in expressions
        // int a=257;
        // byte b=(byte)(a); //explicitly casting into byte
        // System.out.println(b); //returns 1 //because max value of byte is 256 // so here it comes out as 257 % 256 = 1
    
        // byte a =40;
        // byte b=50;
        // byte c=100;
        // int d=a*b/c;
        // System.out.println(d); //returns 20
        //question here is 40*50=2000, to handle this problem java automatically converts byte into int
        //so when we assign it to int, it taking it as a int now 
        int number='A';
        System.out.println(number); //returns 65 here
        //java automatically converts char into int
    }
}