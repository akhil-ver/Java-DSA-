import java.util.*;
public class MultiplyEachElmentOfArray {
    
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("ENter the size of Array : ");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]*10+" ");
            }

            sc.close();
        }
    
}
