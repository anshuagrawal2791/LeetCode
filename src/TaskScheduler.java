import java.util.Arrays;

/**
 * Created by anshu on 30/07/17.
 */
public class TaskScheduler {
    public class Solution {
        public int leastInterval(char[] tasks, int n) {

            int a[] = new int[26];
            for(char x:tasks){
                a[x-'A']++;
            }
            Arrays.sort(a);
            int time=0;
            while(a[25]>0){
                for(int i=0;i<n+1;i++){
                    if(a[25]==0)
                        break;
                    if(i<=25&&a[25-i]>0)
                        a[25-i]--;
                    time++;
                }
                Arrays.sort(a);
            }

            return time;
        }
    }
}
