import java.util.*;
public class RemoveDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of the Array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
       
        HashSet<Integer> set = new HashSet<>();
        int index = 0;
        for(int i=0;i<n;i++){
            if(!set.contains(arr[i])){
                arr[index]= arr[i];
                index++;
            }
            set.add(arr[i]);
        }
        for(int i=0;i<index;i++){
            System.out.print(arr[i]+" ");
        }

         sc.close();
    }
    
    
}

