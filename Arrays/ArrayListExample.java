import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Syntax
        
         ArrayList<Integer> list=new ArrayList<Integer>(10); //writing Integer again after equals to is not mandatory
         
        //  list.add(69);
        //  list.add(634);
        //  list.add(64);
        //  list.add(62);
        //  list.add(65);
        //  list.add(62);
        //  list.add(65);
        //  list.add(67);
        //  list.add(63);
        //  list.add(64);
        //  list.add(66);

        //  System.out.println(list.contains(89)); 

        //  list.set(1,99);

        //  list.remove(2);
        //  System.out.println(list);

        //input
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }

        //get item at any index
        for(int i=0;i<5;i++){
            System.out.print(list.get(i)); //pass index here, list[index] synatx will not here 
        }


    }
}
