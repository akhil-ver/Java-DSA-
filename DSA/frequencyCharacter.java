import java.util.*;
public class frequencyCharacter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // HashMap<Character,Integer> map = new HashMap<>();
        // char[] ch =s.toCharArray();
        // for(int i=0;i<ch.length;i++){
        //     if(map.containsKey(ch[i])){
        //         map.put(ch[i], map.get(ch[i])+1);
        //     }
        //     else
        //         map.put(ch[i],1);
        // }
        // System.out.println(map);

        int[] freq = new int[26];
        s.toLowerCase();
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i] >0)
                System.out.println((char)(i+'a')+" "+freq[i]);
        }
        sc.close();

    }
    
}
