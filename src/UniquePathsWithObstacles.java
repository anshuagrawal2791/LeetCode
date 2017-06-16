import java.util.Arrays;

/**
 * Created by anshu on 16/06/17.
 */
public class UniquePathsWithObstacles {
    public int uniquePathsWithObstacles(int[][] ob) {
        int rows = ob.length;
        if(rows==0)
            return 0;
        int cols = ob[0].length;
        // System.out.println(rows+" "+cols);


        int a[][] = new int[rows][cols];
        if(rows==1&&cols==1&&ob[0][0]==1)
            return 0;
        if(rows==1&&cols==1&&ob[0][0]==0)
            return 1;
        if(ob[0][0]==1)
            return 0;
        if(ob[rows-1][cols-1]==1)
            return 0;
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                if(i!=rows-1||j!=cols-1){
                    if(ob[i][j]==1)
                        a[i][j]=-1;
                    else if(i==rows-1){
                        a[i][j]=(a[i][j+1]==-1)?-1:1;

                    }
                    else if(j==cols-1){
                        a[i][j]=(a[i+1][j]==-1)?-1:1;
                    }
                    else{
                        int x = (a[i+1][j]==-1)?0:a[i+1][j];
                        int y = (a[i][j+1]==-1)?0:a[i][j+1];
                        a[i][j]=x+y;
                    }
                }
                else a[i][j]=1;

            }
        }
        System.out.println(Arrays.deepToString(a));
        return (a[0][0]==-1)?0:a[0][0];

    }
}
