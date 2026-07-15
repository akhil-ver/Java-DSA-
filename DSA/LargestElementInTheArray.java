import java.util.*;
public class LargestElementInTheArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elment of Array : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int maxElement = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i] > maxElement){
                maxElement=arr[i];
            }
        }
        System.out.println("Larget element of the Array is : "+maxElement);
        sc.close();
    }
    
}
