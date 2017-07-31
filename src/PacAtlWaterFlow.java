import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by anshu on 25/07/17.
 */
public class PacAtlWaterFlow {
    public class Solution {
        int a[][];
        int xs[] = new int[]{0,0,1,-1};
        int ys[] = new int[]{1,-1,0,0};
        boolean visitedPac[][];
        boolean visitedAtl[][];
        int rows;
        int cols;
        public List<int[]> pacificAtlantic(int[][] matrix) {
            if(matrix.length==0)
                return new ArrayList<int[]>();
            rows = matrix.length;
            cols = matrix[0].length;
            a = new int[rows][cols];

            for(int b[]:a)
                Arrays.fill(b,-1);

            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    visitedPac = new boolean[rows][cols];
                    visitedAtl = new boolean[rows][cols];
                    visitedPac[i][j]=true;
                    visitedAtl[i][j]=true;
                    if(pac(i,j,matrix)&&atl(i,j,matrix))
                        a[i][j]=1;
                    else
                        a[i][j]=0;
                }
            }
            ArrayList<int []> li = new ArrayList<>();
            for(int i=0;i<rows;i++){
                for(int j=0;j<cols;j++){
                    if(a[i][j]==1){
                        int x[] = new int[2];
                        x[0]=i;
                        x[1]=j;
                        li.add(x);
                    }
                }
            }
            return li;
        }
        boolean pac(int i,int j,int matrix[][]){
//         if(a[i][j]!=-1){

//         }
            // if(a[i][j]==0)
            //     return false;
            if((i==0)||(j==0)){
                return true;
            }
            for(int k=0;k<4;k++){
                int newx=i+xs[k];
                int newy=j+ys[k];
                if(newx>=0&&newx<rows&&newy>=0&&newy<cols&&!visitedPac[newx][newy]&&matrix[newx][newy]<=matrix[i][j]){
                    visitedPac[newx][newy]=true;
                    if(a[newx][newy]==1||pac(newx,newy,matrix)){
                        // a[i][j]=1;
                        return true;
                    }
                    visitedPac[newx][newy]=false;
                }
            }
            // a[i][j]=0;
            return false;
        }
        boolean atl(int i,int j,int matrix[][]){
            // if(a[i][j]!=-1){
            //     return (a[i][j]==1)?true:false;
            // }
            // if(a[i][j]==0)
            //     return false;
            if((i==rows-1)||(j==cols-1)){
                return true;
            }
            for(int k=0;k<4;k++){
                int newx=i+xs[k];
                int newy=j+ys[k];
                if(newx>=0&&newx<rows&&newy>=0&&newy<cols&&!visitedAtl[newx][newy]&&matrix[newx][newy]<=matrix[i][j]){
                    visitedAtl[newx][newy]=true;
                    if(a[newx][newy]==1||atl(newx,newy,matrix)){
                        // a[i][j]=1;
                        return true;
                    }
                    visitedAtl[newx][newy]=false;
                }
            }
            // a[i][j]=0;
            return false;
        }
    }
}
