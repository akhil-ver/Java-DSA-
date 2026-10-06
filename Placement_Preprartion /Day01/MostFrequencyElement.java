import java.util.*;
public class MostFrequencyElement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the  number of siz of array :  ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the element of Array : ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : nums){
            map.put(ele,map.getOrDefault(ele, 0)+1);
        }
        int maxFreq =0;
        int maxvalue =0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            int currKey = entry.getKey();
            int currval = entry.getValue();

            if(currval > maxvalue || (currval == maxvalue && maxFreq > currKey)){
                maxvalue = currval;
                maxFreq = currKey;
            }
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            list.add(entry);
        }
        Collections.sort(list,(a,b)-> b.getValue()-a.getValue());
        System.out.println(list.get(0));
        for(Map.Entry<Integer,Integer> entry : list){
            int key = entry.getKey();
            int val = entry.getValue();

            System.out.println(key+" "+val);
            break;
        }



        System.out.println("Key  : "+maxFreq+" Value -> "+maxvalue);
        
        sc.close();

    }
}
