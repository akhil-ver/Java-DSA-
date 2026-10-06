
public class longestCommonSubsequence {

    
    // public static int lcs(String s1 , String s2){
       
    //     int m = s1.length();
    //     int n = s2.length();
    //     if(m== 0 || n== 0) return 0;
    //     if(s1.charAt(m-1) == s2.charAt(n-1)){
    //         return 1+ lcs(s1.substring(0,m-1), s2.substring(0,n-1));
    //     }else{
    //         return Math.max(lcs(s1.substring(0,m-1), s2.substring(0,n)),lcs(s1.substring(0,m), s2.substring(0,n-1)));
    //     }
        

    // }
    public static int lcs(StringBuilder s1, StringBuilder s2,
                           int m, int n, int[][] dp) {

        if (m == 0 || n == 0)
            return 0;

        if (dp[m][n] != -1)
            return dp[m][n];

        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {

            return dp[m][n] =
                    1 + lcs(s1, s2, m - 1, n - 1, dp);

        } else {

            return dp[m][n] = Math.max(
                    lcs(s1, s2, m - 1, n, dp),
                    lcs(s1, s2, m, n - 1, dp)
            );
        }
    }

    public static int longestCommonSubsequenc(String text1, String text2) {

        StringBuilder s1 = new StringBuilder(text1);
        StringBuilder s2 = new StringBuilder(text2);

        int m = s1.length();
        int n = s2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                dp[i][j] = -1;
            }
        }

        return lcs(s1, s2, m, n, dp);
    }


    public static void main(String[] args){
        String s1 = "bacdef";
        String s2 ="aghcif";
        int ans = longestCommonSubsequenc(s1, s2);
        System.out.println("Common Subsequence Length is : "+ans);

    }
}
