public class FindNonMatch {
    public static void main(String[] args) {
       int[] arr={1,2,3,4,5,6,5,4,3,2,1};
       System.out.println(NonMatch(arr));
    }
    static int NonMatch(int[] arr){
        int unique=0;
        for(int i:arr){
            unique^=i;
        }
        return unique;
    }
}
