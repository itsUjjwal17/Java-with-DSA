import java.lang.reflect.Array;
import java.util.ArrayList;

public class FindMultipleElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,3,77,84,3,3,2,32};
        // index(arr,3,0);
        // System.out.println(list);
        System.out.println(findIndexes2(arr, 3, 0));
    }   

    static ArrayList<Integer> list=new ArrayList<>();
    static void index(int[] arr, int target, int index){
        //base condition
        if(index==arr.length){
            return;
        }
        if (arr[index]==target){
            list.add(index);
        }
        index(arr,target,index+1); 
    } 


    static ArrayList<Integer> findIndexes(int[] arr,int target, int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findIndexes(arr, target, index+1, list);
    }

    static ArrayList<Integer> findIndexes2(int[] arr,int target, int index){
        ArrayList<Integer> list=new ArrayList<>();

        if(index==arr.length){
            return list;
        }

        //this will contain answer for that function call only
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findIndexes2(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list; 
    }
}
