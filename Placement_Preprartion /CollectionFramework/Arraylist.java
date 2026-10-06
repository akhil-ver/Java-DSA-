import java.util.*;
public class Arraylist{
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        System.out.println(list);
        list.add(1,"C++");
        System.out.println(list);

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("SQL");
        list1.add("Spring");
        list.addAll(list1);
        System.out.println(list);
        list.addAll(1,list1);
        System.out.println(list);

        System.out.println(list.get(0));
        list.set(1,"JavaScript");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        list.remove("Python");
        System.out.println(list);
        //list.clear();
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("Java"));
        System.out.println(list.indexOf("Java"));
        System.out.println(list.lastIndexOf("JavaScript"));
        System.out.println(list.equals(list1));
        ArrayList<String> copy = (ArrayList<String>) list.clone();
        System.out.println(copy);
        String[] arr = list.toArray(new String[0]);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        list.forEach(x->System.out.print(x+" "));
        System.out.println();
        System.out.println(list.subList(0,3));
        list.add("Java");
        list1.add("Java");
        System.out.println(list);
        System.out.println(list1);
        
        System.out.println(list.retainAll(list1));
        //System.out.println(list.removeAll(list1));
        System.out.println(list.containsAll(list1));
        System.out.println(list.hashCode());
        System.out.println(list);
        //Collections.sort(list);
        list.sort(String :: compareTo );
        System.out.println(list);


        
        

    }
}