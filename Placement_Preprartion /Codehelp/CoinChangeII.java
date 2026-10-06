import java.util.*;
public class CoinChangeII {
    public static int solve(int amount , int index , int[] coins){

        if(amount == 0){
            return 1;
        }
        if(amount <0) return 0;
        if(index >= coins.length){
            return 0;
        }

        int includeAns = solve(amount-coins[index], index, coins);

        int excludeAns = solve(amount, index+1, coins);

        return includeAns+excludeAns;
    }
    public static int change(int amount , int[] coins){

        int ans = solve(amount,0,coins);

        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        int amount = sc.nextInt();
        int coin = change(amount,coins);
        System.out.println(coin);
        sc.close();
    }
}
