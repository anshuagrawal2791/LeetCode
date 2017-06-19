/**
 * Created by anshu on 20/06/17.
 */
public class RemoveDuplicates2 {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if(n==0||n==1||n==2)
            return n;
        int counter=0;
        for(int i=0;i<n;){
            nums[counter++]=nums[i];
            if(i<n-1&&nums[i]==nums[i+1]){
                nums[counter++]=nums[i];
                i++;}
            while(i<n-1&&nums[i]==nums[i+1])
                i++;

            i++;
        }
        return counter;
    }
}
