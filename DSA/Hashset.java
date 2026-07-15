package CollectionFramework;
import java.util.*;
public class Hashset {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

        System.out.println(set.contains(1));
        set.remove(1);
        System.out.println(set.size());

        //Iterator
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

       
    }
}
