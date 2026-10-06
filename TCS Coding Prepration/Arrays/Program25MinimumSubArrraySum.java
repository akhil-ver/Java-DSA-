import java.util.*;
public class Program25MinimumSubArrraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int sum =0;
        for(int i=0;i<size;i++){
            sum+=arr[i];
            if(sum < min){
                min = sum;
            }
            if(sum > min){
                sum = 0;
            }
        }
        System.out.println(min);
        sc.close();
    }
}
