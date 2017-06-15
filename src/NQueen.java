import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 15/06/17.
 */
public class NQueen {
    HashSet<List<String>> finalList = new HashSet<>();
    public List<List<String>> solveNQueens(int n) {
        char a[][] = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]='.';
            }
        }
        nQueen(a,0,0,n);
        return new ArrayList<List<String>>(finalList);

    }
    void nQueen(char a[][],int col,int row,int n){
        // System.out.println(Arrays.deepToString(a)+"   "+row+" "+col);
        if(col==n){
            List<String> li = new ArrayList<>();
            for(int i=0;i<n;i++){
                String s = new String(a[i]);
                li.add(s);
            }
            finalList.add(li);
        }
        else{
            for(int i=0;i<n;i++){
                if(isSafe(a,col,i,n)){
                    a[i][col]='Q';
                    nQueen(a,col+1,i,n);
                    a[i][col]='.';
                }
            }

        }
    }
    boolean isSafe(char a[][], int col,int row,int n){
        return (horizontally(a,col,row,n)&&upperDiagonally(a,col,row,n)&&lowerDiagonally(a,col,row,n));
    }
    boolean horizontally(char a[][], int col,int row,int n){
        for(int j=0;j<col;j++){
            if(a[row][j]=='Q')
                return false;
        }
        return true;
    }
    boolean upperDiagonally(char a[][], int col,int row,int n){
        int i = row-1;
        for(int j=col-1;j>=0&&i>=0;j--){
            if(a[i][j]=='Q')
                return false;
            i--;
        }
        return true;
    }
    boolean lowerDiagonally(char a[][], int col, int row, int n){
        int i=row+1;
        for(int j=col-1;j>=0&&i<n;i++,j--){
            if(a[i][j]=='Q')
                return false;
        }
        return true;
    }
}
