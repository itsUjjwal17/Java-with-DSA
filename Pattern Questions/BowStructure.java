

public class BowStructure {
    public static void main(String[] args) {
        pattern(5);
    }

    static void pattern(int n) {
        for (int row = 0; row <= n*2; row++) {
            int totalColsInRow=row>n?2*n-row: row;
            for(int col=0;col<totalColsInRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
