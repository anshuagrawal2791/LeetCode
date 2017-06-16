/**
 * Created by anshu on 16/06/17.
 */
public class GenerateSpiralMatrix {
    public int[][] generateMatrix(int n) {
        if(n==0)
            return new int[0][0];
        int a[][] = new int[n][n];
        int rowBegin=0,rowEnd=n-1,colBegin=0,colEnd=n-1;
        int count =1;
        while(rowBegin<=rowEnd&&colBegin<=colEnd){
            for(int i=colBegin;i<=colEnd;i++){
                a[rowBegin][i]=count++;
            }
            rowBegin++;
            for(int i=rowBegin;i<=rowEnd;i++){
                a[i][colEnd]=count++;
            }
            colEnd--;
            if(rowBegin<=rowEnd){
                for(int i=colEnd;i>=colBegin;i--)
                    a[rowEnd][i]=count++;
                rowEnd--;
            }
            if(colBegin<=colEnd){
                for(int i=rowEnd;i>=rowBegin;i--)
                    a[i][colBegin]=count++;
                colBegin++;
            }
        }
        return a;
    }
}
