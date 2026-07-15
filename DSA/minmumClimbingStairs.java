import java.util.*;
public class minmumClimbingStairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] cost = new int[n];
        for(int i=0;i<n;i++){
            cost[i]=sc.nextInt();
        }
        int[] dp = new int[n];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for(int i=2;i<n;i++){
            dp[i]= cost[i]+Math.min(dp[i-1],dp[i-2]);
        }
        System.out.println(Math.min(dp[n-1],dp[n-2]));
        sc.close();
    }
}
