import java.util.*;
public class FibonacciNumber {
    public static int helper(int n , int[] dp){
        if(n<=1) return n;
        if(dp[n] != 0) return dp[n];
        dp[n] = helper(n-1,dp)+helper(n-2,dp);
        return dp[n];
    }
    public static int  fib(int n){
        int[] dp = new int[n+1];

        return helper(n,dp);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.print("Fibonacci Term : ");
        System.out.println(fib(n));
        System.out.println();
        sc.close();
        
    }
}
