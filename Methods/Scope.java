public class Scope {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        
        {
            // int a=69; //already initialized outside the block in the same method, hence you cannot initialise again
            a=69; //but we can change the value
            int c=99;
            //value initialized in this blck will remain in this block
        }
        System.out.println(c); //error //cannot use outside the block  
        

        for(int i=0;i<4;i++){
            System.out.println(i);
            int num=90;
            int a=10;
        }
        System.out.println(i); //cannot use i outside the loop or block
    }
    static void random(int marks){
        int num=67;
        System.out.println(num);
        System.out.println(marks);
    }
}
//that is anything initialise outside the block can be used inside the block
//but anything initialise inside the block can also be initialise the block