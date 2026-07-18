import java.util.Scanner;

public class UnquiePaths {
    public static int path(int i , int j ,int endRow,int endCol,int[][] dp){
        if(i>=endRow|| j>= endCol) return 0;
        if(i== endRow-1 && j==endCol-1) return 1;
        if(dp[i][j] != -1) return dp[i][j];
        dp[i][j] = path(i, j+1, endRow, endCol, dp)+path(i+1, j, endRow, endCol, dp);
        return dp[i][j];
    }
    public static int paths(int m , int n){
        int[][] dp = new int[m+1][n+1];
        //Arrays.fill(dp,-1);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return path(0,0,m,n,dp);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Row : ");
        int row = sc.nextInt();
        System.out.print("Enter the number of Column : ");
        int col = sc.nextInt();

        int uniquePath = paths(row ,col);
        System.out.println("Number of unquie path is : "+uniquePath);
        
        sc.close();
    }
}
