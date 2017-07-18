import java.util.HashSet;

/**
 * Created by anshu on 18/07/17.
 */
public class LongestConsecutiveSequence {
    public class Solution {
        public int longestConsecutive(int[] nums) {
            HashSet<Integer> set = new HashSet<>();
            for(int i:nums){
                set.add(i);
            }
            int global = Integer.MIN_VALUE;
            for(int i:set){
                int cur=1;
                if(!set.contains(i-1)){
                    int y = i+1;

                    while(set.contains(y)){
                        cur++;
                        y++;
                    }
                }
                global=Math.max(global,cur);
            }
            return (global!=Integer.MIN_VALUE)?global:0;
        }
    }
}
