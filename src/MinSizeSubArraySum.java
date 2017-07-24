/**
 * Created by anshu on 19/07/17.
 */
public class MinSizeSubArraySum {
    public class Solution {
        public int minSubArrayLen(int s, int[] a) {
            int n = a.length;
            if(n==0)
                return 0;
            int i=0;
            // while(i<n&&a[i]>s)
            //     i++;
            int j=i+1;
            int global = Integer.MAX_VALUE;
            int cur=a[i];
            while(i<n&&j<=n){
                if(cur>=s){
                    global=Math.min(global,j-i);
                    cur-=a[i];
                    i++;
                }else{
                    if(j<n)
                        cur+=a[j];
                    else break;
                    j++;
                }
            }
            // if(i==n)
            //     return 0;
            return (global!=Integer.MAX_VALUE)?global:0;

        }
    }
}
