import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        int count = 0;
        int len = nums.length;
        
        HashSet<Integer> s = new HashSet<>();
        
        for (int i =0; i < len; i++) {
            s.add(nums[i]);
        }
        
        System.out.println(s.size());
        
        
        if (s.size() > (len / 2)) {
            return len / 2;
        } else {
            return s.size();
        }
        
        /*
        
        
        */
        
    }
}