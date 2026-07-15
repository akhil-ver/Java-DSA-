import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("ENter the size of Array : ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                
            }
            System.out.print("Enter the target element : ");
            int target = sc.nextInt();
            for(int i=0;i<n;i++){
                if(arr[i] == target){
                    System.out.println("Element found at index "+i);
                }
                
            }

            sc.close();
        }
}
