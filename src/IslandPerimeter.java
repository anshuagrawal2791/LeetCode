import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by anshu on 26/07/17.
 */
public class IslandPerimeter {
    public class Solution {
        class Cell{
            int i,j;
            public Cell(int i,int j){
                this.i=i;
                this.j=j;
            }
        }
        int xs[] = new int[]{0,0,1,-1};
        int ys[] = new int[]{1,-1,0,0};
        public int islandPerimeter(int[][] grid) {
            int rows = grid.length;
            if(rows==0)
                return 0;
            int cols = grid[0].length;
            // int i,j;
            Cell root=null;
            boolean flag=false;
            for(int i=0;i<rows;i++){
                if(!flag){
                    for(int j=0;j<cols;j++){
                        if(grid[i][j]==1){
                            root = new Cell(i,j);
                            flag=true;
                            break;
                        }
                    }
                }
                else break;
            }
            int ans=0;
            ans+=getSides(root.i,root.j,grid);
            // HashSet<Cell> visited = new HashSet<>();
            // visited.add(root);
            int visited[][] = new int[rows][cols];
            visited[root.i][root.j]=1;
            Queue<Cell> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Cell cur = q.poll();
                // System.out.println(cur.i+" "+cur.j+" ans: "+ans);
                for(int k=0;k<4;k++){
                    int newi=cur.i+xs[k];
                    int newj = cur.j+ys[k];
                    if(isValid(newi,newj,rows,cols)&&visited[newi][newj]==0&&grid[newi][newj]==1){
                        ans+=getSides(newi,newj,grid);
                        visited[newi][newj]=1;
                        q.add(new Cell(newi,newj));
                    }
                }
            }
            return ans;
        }
        boolean isValid(int i,int j,int rows,int cols){
            return (i>=0&&i<rows&&j>=0&&j<cols);
        }
        int getSides(int i,int j,int grid[][]){
            int count =0;
            for(int k=0;k<4;k++){
                int newi=i+xs[k];
                int newj=j+ys[k];
                if(!isValid(newi,newj,grid.length,grid[0].length))
                    count+=1;
                else if(grid[newi][newj]==0)
                    count+=1;
            }
            // System.out.println(i+"--"+j+"--"+count);
            return count;
        }
    }
}
