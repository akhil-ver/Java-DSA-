import java.util.*;
public class houseRobber {
    public static int amount(int[] nums, int i ,int[] dp){
        if(i>= nums.length) return 0;
        if(dp[i] != -1) return dp[i];
        int take = nums[i]+amount(nums, i+2, dp);
        int skip = amount(nums, i+1, dp);
        dp[i] = Math.max(take,skip);
        return dp[i];
    }
    public static int rob(int[] nums){
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        return amount(nums, 0, dp);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(rob(nums));
        sc.close();
    }
}
