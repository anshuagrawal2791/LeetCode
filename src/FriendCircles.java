/**
 * Created by anshu on 26/07/17.
 */
public class FriendCircles {


    public class Solution {
        int v;
        int visited[];
        public int findCircleNum(int[][] M) {
            v = M.length;
            if(v==0)
                return 0;
            visited = new int[v];
            int count =0;
            for(int i=0;i<v;i++){
                if(visited[i]==0){
                    traverse(i,M);
                    count++;
                }
            }
            return count;
        }

        void traverse(int i,int a[][]){
            visited[i]=1;
            for(int k=0;k<v;k++){
                if(a[i][k]==1&&visited[k]==0){
                    traverse(k,a);
                }
            }
        }
    }
}
