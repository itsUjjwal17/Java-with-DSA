import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //collection of datatypes we can use array for this

        /*
            syntax:

            //datatype[]  variable_name=new datatype[size];
         */

         //store 5 roll numbers:
         int[] roll=new int[5];

         //or directly
         int[] rnos={1,2,3,4,5}; //all the type of data shoudld be same

        //  int[] ros; //declaration of array. roll is defined in the stack
        //  ros=new int[5]; //initialization: actually here object is being created in the heap

        //  System.out.println(ros[0]);

        //  String[] arr=new String[4];
        //  System.out.println(arr[0]); //returns null(a literal, cant used as variable or object to primitives only)

        //  String name=null; //accepted
        //  int num=null; //not accepted

        // for(String element:arr){
        //     System.out.println(element);
        // }

        int[][] arr;
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

    }
}