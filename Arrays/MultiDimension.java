import java.util.Arrays;
import java.util.Scanner;
public class MultiDimension {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
         1 2 3
         4 5 6
         7 8 9
         */

        //  int[][] arr=new int[3][]; //adding no. of columns is not mandatory, rows is mandatory
        //  int[][] arr2D={
        //     {1,2,3}, //0th index
        //     {4,5,6}, //1st index
        //     {7,8,9}  //2nd index //not necessary that elements in cols should be 3 only
        //  };

         
         int[][] arr=new int[3][3];
         System.out.println(arr.length); //returns only no. of rows
         
         //input
         for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=sc.nextInt();
            }
         }

         //output
        //  for(int row=0;row<arr.length;row++){
        //     for(int col=0;col<arr[row].length;col++){
        //         System.out.print(arr[row][col]+ " ");
        //     }
        //     System.out.println();
        //  }

        //  for(int row=0;row<arr.length;row++){
        //     System.out.println(Arrays.toString(arr[row]));
        //  }

         for(int[] a: arr){
            System.out.println(Arrays.toString(a));
         }

    }
}
