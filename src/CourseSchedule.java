/**
 * Created by anshu on 19/07/17.
 */
public class CourseSchedule {
    public class Solution {
        int a[][];
        int total;
        boolean visited[];
        public boolean canFinish(int n, int[][] pre) {
            a = new int[n][n];
            total=n;
            visited = new boolean[n];
            boolean explored[] = new boolean[n];
            int rows = pre.length;
            // int cur=0;
            for(int i=0;i<rows;i++){
                int first = pre[i][0];
                int second = pre[i][1];
                a[first][second]=1;
                // cur=first;
            }
            // System.out.println(Arrays.deepToString(a));
            for(int i=0;i<n;i++){
                if(!visited[i]){
                    if(isCyc(i,explored))
                        return false;
                }
            }
            return true;
        }
        boolean isCyc(int v,boolean explored[]){
            explored[v]=true;
            // System.out.println(v+" "+ Arrays.toString(explored));
            // System.out.println(Arrays.deepToString(a));

            for(int i=0;(i<total);i++){
                // System.out.println("v and i here is "+v+" "+i);
                if(a[v][i]==1){
                    if(explored[i])
                        return true;
                    else if(isCyc(i,explored))
                        return true;
                }
            }
            explored[v]=false;
            visited[v]=true;
            return false;
        }
    }
}
