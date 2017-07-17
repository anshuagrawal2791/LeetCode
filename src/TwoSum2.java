/**
 * Created by anshu on 17/07/17.
 */
public class TwoSum2 {
    public int[] twoSum(int[] a, int target) {
        int ans[] = new int[2];
        int i=0,j=a.length-1;
        while(i<j){
            int x = a[i]+a[j];
            if(x==target){
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }else if(x<target){
                i++;
            }else{
                j--;
            }
        }
        return ans;
    }
}
