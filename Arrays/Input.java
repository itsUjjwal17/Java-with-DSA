import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //array of primitives
        int[] arr=new int[5];
        arr[0]=23;
        arr[1]=45;
        arr[2]=73;
        arr[3]=54;
        arr[4]=69;
        // [23,45,73,54,69]
        System.out.println(arr[3]);

        //input using for loop
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }

        // System.out.println(Arrays.toString(arr));
        // // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i]);
        // }

        // for(int num:arr){ //for every element in array,print the element 
        //     System.out.println(num+ " "); //here num represents elements of the array
        // }
        // System.out.println(arr[5]); //index out of bound error

        //array of objects

        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1]="Ujjwal";
        System.out.println(Arrays.toString(str));
    }
}
