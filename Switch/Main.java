import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // String fruit=sc.next();

        // switch(fruit){
        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println( "Red sweet fruit");
        //         break;
        //     case "Grapes":
        //         System.out.println("Small fruit");
        //         break;
        //     default:
        //         System.out.println("please enter a valid fruit");
        // }
        // String a="Kunal";
        // String b="Kunal";
        // System.out.println(a==b); //returns true


        int day=sc.nextInt();
        // switch (day){
        //     case 1 ->System.out.println("Monday");
        //     case 2 ->System.out.println("Tuesday");
        //     case 3 ->System.out.println("Wednesday");
        //     case 4 ->System.out.println("Thursday");
        //     case 5 ->System.out.println("Friday");
        //     case 6 ->System.out.println("Saturday");
        //     case 7 ->System.out.println("Sunday");
        //     default -> System.out.println("Week only have 7 days");
        // }
            switch(day){
                case 1,2,3,4,5 -> System.out.println("Weekdays");
                case 6,7 -> System.out.println("Weekends");
            }

            

    }
}
