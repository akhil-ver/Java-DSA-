package CollectionFramework;

import java.util.*;

public class ModeOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        System.out.println("Enter the elements of the array:");
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Store frequency of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0;
        int mode = 0;

        for (int element : frequencyMap.keySet()) {

            int frequency = frequencyMap.get(element);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = element;
            }
        }

        System.out.println("Mode = " + mode);
        System.out.println("Frequency = " + maxFrequency);
        sc.close();
    }
}