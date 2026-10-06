import java.util.*;
public class MostKFrequencyElement{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number of siz of array :  ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element of Array : ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.print("Enter the top K Frequency : ");
        int k = sc.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele, 0)+1);
        }
        // int maxKey =0;
        // int maxvalue=0;
        // for(Map.Entry<Integer, Integer> entry : map.entrySet()){
        //     int currKey = entry.getKey();
        //     int currval = entry.getValue();

        //     if(currval > maxvalue ||(currval == maxvalue && currKey < maxKey)){
        //         maxKey = currKey;
        //         maxvalue=currval;
        //     }
        // }
        // System.out.println("Key  : "+maxKey+" Value -> "+maxvalue);

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(entry);
        }
        Collections.sort(list,(a,b)-> b.getValue()-a.getValue());

        int[] freq = new int[k];
        int i=0;
        for(Map.Entry<Integer,Integer> entry : list){
            freq[i] = entry.getKey();
            i++;
            if(i== k){
                break;
            }
        }
        for(i=0;i<k;i++){
            System.out.print(freq[i]+" ");
        }

        sc.close();
    }
}