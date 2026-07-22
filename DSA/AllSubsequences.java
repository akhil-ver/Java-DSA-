import java.util.*;
public class AllSubsequences {
    public static void solve(String s, int index , StringBuilder output , List<String> ans){

        if(index == s.length()){
            if(output.length() ==0){
                return;
            }
            else{
                ans.add(output.toString());
                return;
            }
        }
        char ch = s.charAt(index);
        output.append(ch);
        solve(s,index+1,output,ans);
        output.deleteCharAt(output.length()-1);
        solve(s,index+1,output,ans);
    }
    public static List<String> sequence(String s){
        List<String> ans = new ArrayList<>();
        StringBuilder output = new StringBuilder();
        solve(s,0,output,ans);

        return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        List<String> result = sequence(s);
        Collections.sort(result);
        System.out.println(result);
        sc.close();
    }
}
