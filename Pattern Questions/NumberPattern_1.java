public class NumberPattern_1 {
    public static void main(String[] args) {
        pattern(4);
    }

    static void pattern(int n) {
        for(int row=1;row<=n*2;row++){
            int c=row > n ? 2 * n - row : row;
            for(int space=0;space<n-c;space++){
                System.out.print(" ");
            }
            for(int col=c;col>=1;col--){
                System.out.print(col);
            }
            for(int col=2;col<=c;col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}

