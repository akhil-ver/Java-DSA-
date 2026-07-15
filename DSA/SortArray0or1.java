package CollectionFramework;

import java.util.*;

public class SortArray0or1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n - 1;

        while (left < right) {

            if (arr[left] == 0 && arr[right] == 1) {
                left++;
                right--;
            }
            else if (arr[left] == 0) {
                left++;
            }
            else if (arr[right] == 1) {
                right--;
            }
            else {   // arr[left] == 1 && arr[right] == 0
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}