import java.util.*;
public class twoSum {
    public static int[] twoSu(int[] nums , int target){
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i],i);
        }

        return new int[]{-1,-1};
    }
    public static void main(String[] args){
        int[] nums = {2,7,8,1,3,0,4};
        int target =9;
        int[] ans = twoSu(nums,target);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
