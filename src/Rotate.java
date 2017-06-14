/**
 * Created by anshu on 14/06/17.
 */
public class Rotate {
    public void rotate(int[][] a) {
        int n = a[0].length;
        // System.out.println(n+"");
        for(int i=0;i<n/2;i++){
            for(int j=i;j<n-1-i;j++){
                int temp=a[i][j];
                a[i][j]=a[n-j-1][i];
                a[n-j-1][i]=a[n-i-1][n-j-1];
                a[n-i-1][n-j-1]=a[j][n-i-1];
                a[j][n-i-1]=temp;
            }
        }
        // System.out.println(Arrays.deepToString(a));
    }
}
