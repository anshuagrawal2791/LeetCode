/**
 * Created by anshu on 06/06/17.
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int n = height.length;
        int low=0,high=n-1;
        int ans=Integer.MIN_VALUE;
        while(high>low){
            ans = Math.max(ans,(high-low)*Math.min(height[low],height[high]));
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return ans;
    }
}
