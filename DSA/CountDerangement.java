import java.util.*;
public class CountDerangement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Count for reagrangment : ");
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        dp[0]=1;
        dp[1]=0;
        dp[2]=1;
        for(int i=3;i<=n;i++){
            dp[i]=(i-1)*(dp[i-1]+dp[i-2]);
        }
        System.out.println("For "+n+" possible Dearangement are "+dp[n]);
        sc.close();
    }
}
