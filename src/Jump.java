/**
 * Created by anshu on 14/06/17.
 */
public class Jump {
    public int jump(int[] nums) {
        int n = nums.length;
        if(n==1)
            return 0;
        int [] res = new int[n];
        // for(int i=0;i<n;i++)
        //     if(nums[i]==0)
        //         res[i]=Integer.MAX_VALUE;

        res[n-1]=0;
        for(int i=n-2;i>=0;i--){

            int min = Integer.MAX_VALUE;
            for(int j=i+1;j<n&&j<=i+nums[i];j++){
                if(res[j]<min)
                    min=res[j];
            }
            if(min!=Integer.MAX_VALUE)
                res[i]=min+1;
            else res[i]=min;

        }
        return res[0];
    }
}
