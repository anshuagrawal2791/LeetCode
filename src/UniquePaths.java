/**
 * Created by anshu on 16/06/17.
 */
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        if(n==0||m==0)
            return 0;
        if(n==1&&m==1)
            return 1;
        int a[][] = new int[m][n];
        for(int i=0;i<n;i++)
            a[m-1][i]=1;
        for(int i=0;i<m;i++)
            a[i][n-1]=1;
        a[m-1][n-1]=0;
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                a[i][j]=a[i][j+1]+a[i+1][j];
            }
        }
        return a[0][0];
    }
}
