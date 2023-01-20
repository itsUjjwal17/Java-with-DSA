import java.util.Scanner;
public class Sum {
    public static void main(String[] args){
    //     sum(); //function call
    // }

    //     /*
    //         return _type name(){
    //             //body
    //             return statements;
    //         }
    //      */
         
    //      static void sum(){
    //         Scanner sc=new Scanner(System.in);
    //         System.out.print("enter number 1: ");
    //         int num1=sc.nextInt();
    //         System.out.print("enter number 2: ");
    //         int num2=sc.nextInt();
    //         int sum=num1+num2;

    //         System.out.println("sum is "+sum);
    //      }

    // int ans=sum2();
    // System.out.println(ans);

    int ans=sum3(5,5);
    System.out.println(ans);
}
//return the value
static int sum2(){
    Scanner sc=new Scanner(System.in);
        System.out.print("enter number 1: ");
        int num1=sc.nextInt();
        System.out.print("enter number 2: ");
        int num2=sc.nextInt();
        int sum=num1+num2;

        return sum;
}

//pass the value of number when you are calling the method in main()
static int sum3(int a, int b){
    int sum=a+b;
    return sum;
}
    
}
