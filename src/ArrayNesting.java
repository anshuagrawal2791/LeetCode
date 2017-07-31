import java.util.Arrays;

/**
 * Created by anshu on 27/07/17.
 */
public class ArrayNesting {
    public class Solution {
        int cache[];
        public int arrayNesting(int[] nums) {
            if(nums.length==0)
                return 0;
            cache = new int[nums.length];
            Arrays.fill(cache,-1);
            int max=1;

            for(int i=0;i<nums.length;i++){
                // System.out.println(Arrays.toString(cache));
                int l = len(i,nums);
                cache[i]=l;
                max=Math.max(max,l);
                if(max>(nums.length)/2)
                    break;
            }
            return max;
        }
        int len(int i,int a[]){
            int count=0;
            boolean visited[] = new boolean[a.length];
            // visited[i]=true;
            while(!visited[i]){
                visited[i]=true;
                count++;
                i=a[i];
                // if(cache[i]!=-1){
                //     count+=cache[i];
                //     break;
                // }

            }
            return count;
        }
    }
}
