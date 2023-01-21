public class EvenDigits {
    public static void main(String[] args) {
        int[] arr={12,3,2568,47,852};
        System.out.println(Number(arr));
        System.out.println(digits(0));
        
    }
    static int Number(int[] arr){
        int count=0;
        for(int i:arr){
            if(even(i)){
                count++;
            }
        }
        return count;
    }

    //function to check whether a number contains even digit or not
    static boolean even(int i){
        int numberofDigits=digits(i);
        return numberofDigits%2==0;
         
    }

    //count number of digits in a number
    static int digits(int i){
        if(i<0){
            i=i*-1;
        }
        if(i==0){
            return 1;
        }
        int count=0;
        while(i>0){
            count++;
            i/=10;
        }
        return count;
    } 
}

