import java.util.*;
public class FindingPairing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of friends : ");
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+(i-1)*dp[i-2];
        }
        System.out.print("Number of pair that "+n+" Friends make : ");
        System.out.println(dp[n]);
        sc.close();
    }
}
