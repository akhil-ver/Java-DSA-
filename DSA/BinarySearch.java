import java.util.Scanner;
public class BinarySearch {
    public static boolean binarySearch(int[] arr , int target){
     
        int left =0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left+(right-left)/2;
            if(arr[mid] == target) return true;
            else if(arr[mid] > target) right =mid-1;
            else left = mid+1;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of Array in sorted order : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target number : ");
        int target = sc.nextInt();
        boolean flag = binarySearch(arr,target);
        if(flag){
            System.out.println("Target is found on array");
        }else{
            System.out.println("Target is not found on array");
        }
        sc.close();
    }
}
