import java.util.*;
public class AverageOfArrayElment {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter the size of Array : ");
        int n = sc.nextInt();
        double sum =0;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Average of All element in the array is : "+sum/n);
        sc.close();
    }
}
