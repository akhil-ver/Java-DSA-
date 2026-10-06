import java.util.Scanner;

public class CoinChange {
    public static int coinChange(int amount , int[] coins){
        
        return -1;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for(int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        int amount = sc.nextInt();
        int coin = coinChange(amount,coins);
        System.out.println(coin);
        sc.close();
    }
}
