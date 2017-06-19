/**
 * Created by anshu on 20/06/17.
 */
public class Search2 {
    public boolean search(int[] nums, int target) {


        int n = nums.length;
        if(n==0)
            return false;
        int min = Integer.MAX_VALUE;
        int mini=0;
        for(int i=0;i<n;i++){
            if(nums[i]<nums[left(i,n)]&&nums[i]<=nums[(i+1)%n]){
                min = nums[i];
                mini=i;
            }
        }
        // System.out.println(mini+" "+min);
        int l=0,h=n-1,rot=mini;

        if(target<=nums[h])
            l=rot;
        else h=rot-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(target==nums[mid])
                return true;
            if(target>nums[mid])
                l=mid+1;
            else h=mid-1;
        }
        return false;
    }
    int left(int i,int n){
        if(i==0)
            return n-1;
        else return i-1;
    }
}
