/**
 * Created by anshu on 17/07/17.
 */
public class CalculateMinHP {
    public int calculateMinimumHP(int[][] dungeon) {
        int rows = dungeon.length;
        if(rows<=0)
            return 0;
        int cols = dungeon[0].length;
        int a[][] = new int[rows][cols];
        // a[rows-1][cols-1] = ( (1-dungeon[rows-1][cols-1]>0)?>1-dungeon[rows-1][cols-1]:1);
        int y = 1 - dungeon[rows-1][cols-1];
        if(y>0)
            a[rows-1][cols-1]=y;
        else a[rows-1][cols-1]=1;
        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                if(i!=rows-1||j!=cols-1){
                    if(i==rows-1){
                        a[i][j]= (a[i][j+1] - dungeon[i][j] >0)?a[i][j+1]-dungeon[i][j]:1;
                    }else if(j==cols-1){
                        a[i][j]= (a[i+1][j] - dungeon[i][j] >0)?a[i+1][j]-dungeon[i][j]:1;

                    }else{
                        int x = Math.min(a[i+1][j],a[i][j+1]);
                        if(dungeon[i][j]<x)
                            a[i][j]=x-dungeon[i][j];
                        else
                            a[i][j]=1;
                    }
                }
            }
            // System.out.println(Arrays.deepToString(a));
        }
        return a[0][0];

    }
}
