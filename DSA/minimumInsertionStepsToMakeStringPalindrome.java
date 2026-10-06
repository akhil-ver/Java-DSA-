public abstract class minimumInsertionStepsToMakeStringPalindrome {
    public static int  lcs(StringBuilder s1 , StringBuilder s2 , int m , int n , int[][] dp){
        if(m ==0 || n == 0) return 0;
        if(dp[m][n] != -1 ) return dp[m][n];
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return dp[m][n] = 1 + lcs(s1, s2, m-1, n-1, dp);
        }else{
            return dp[m][n] = Math.max( lcs(s1, s2, m-1, n, dp), lcs(s1, s2, m, n-1, dp));
        }
    }
    public static void main(String[] args){
        String text1 = "abcdbafga";
        StringBuilder s1 = new StringBuilder(text1);
        StringBuilder s2 = new StringBuilder(text1);
        s2.reverse();
        
System.out.println(s1);
System.out.println(s2);
        int m = s1.length();
        int[][] dp = new int[m+1][m+1];
        for(int i =0;i<=m;i++){
            for(int j =0;j<=m;j++){
                dp[i][j] = -1;
            }
        }

        int ans = lcs(s1,s2,m,m,dp);
        System.out.println("Minimum Insertion to make Palindrome String is : " + (text1.length() - ans));
       

       

    
    }
}
