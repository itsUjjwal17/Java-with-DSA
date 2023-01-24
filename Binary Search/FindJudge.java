public class FindJudge { 

    public static void main(String[] args) {
        int n = 3;
        int[][] trust = { { 1, 3 }, { 2, 3 } ,{3,1}};
        System.out.println(findJudge(n, trust));
    }

    static int findJudge(int n, int[][] trust) {
        int row=0;
        int col=1;
        if(trust[row][col]==n){
            return trust[row][col];
        }else if(trust[row][col]==trust[row+1][col]){
            row++;
            return trust[row][col];
        }
        return -1;
    }
}
