/**
 * Created by anshu on 31/07/17.
 */
public class PredictTheWinner {
    public class Solution {
        public boolean PredictTheWinner(int[] nums) {
            int x=predict(0,nums.length-1,nums);
            int sum=0;
            for(int i=0;i<nums.length;i++)
            {
                sum+=nums[i];
                if(sum>(2*x))
                    return false;
            }
            return true;
        }
        int predict(int i,int j,int a[]){
            if(j<i)
                return 0;
            if(i==j)
                return a[i];
            if(i==j-1)
                return Math.max(a[i],a[j]);
            return Math.max(a[i]+Math.min(predict(i+2,j,a),predict(i+1,j-1,a)),a[j]+Math.min(predict(i,j-2,a),predict(i+1,j-1,a)));
        }
    }
}
