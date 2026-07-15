package CollectionFramework;
import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }

        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",120);
        map.put("US",30);
        map.put("China",150);
        System.out.println(map);
        map.put("China",180); // not repeat only update the value key is unquie in Hashmap
        System.out.println(map);

        if(map.containsKey("India")){
            System.out.println("Key is present in the map");
        }else{
            System.out.println("Key is not present in the map");
        }

        if(map.containsKey("Russia")){
            System.out.println("Key is present in the map");
        }else{
            System.out.println("Key is not present in the map");
        }
        // for(int i=0;i<map.size();i++){
        //      System.out.print(map.get(i)+" ");
        // }

        // for(String key : map.keySet()){
        //      System.out.print(key+" ");
        // }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
        map.forEach((key, value) -> {
            if(key.equals("India")) {
                System.out.print(value);
            }
            
            //System.out.println(key+" "+value)
        });

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }

        map.put("India",map.getOrDefault("India",0)+1);
        System.out.println(map);


    


        


        


    }

}
