/**
 * Created by anshu on 13/06/17.
 */
public class SolveSudoku {
    int i,j;
    public void solveSudoku(char[][] a) {
        solve(a);
    }
    boolean solve(char[][] a){
        if(isDone(a))
            return true;
        int currow=i;
        int curcol=j;
        for(int num=1;num<=9;num++){
            if(check(a,currow,curcol,Character.forDigit(num, 10))){
                a[currow][curcol]=Character.forDigit(num, 10);
                if(solve(a)==true)
                    return true;
                a[currow][curcol]='.';
            }
        }
        return false;

    }
    boolean isDone(char[][] a){
        for(int row=0;row<9;row++){
            for(int col=0;col<9;col++){
                if(a[row][col]=='.'){
                    i=row;
                    j=col;
                    return false;
                }
            }
        }
        return true;
    }
    boolean check(char a[][],int i,int j,char num){
        return(checkRow(a,i,j,num)&&checkCol(a,i,j,num)&&checkBox(a,i,j,num));
    }
    boolean checkRow(char a[][],int i,int j,char num){
        for(int col=0;col<9;col++){
            if(a[i][col]==num&&col!=j){
                return false;
            }
        }
        return true;
    }
    boolean checkCol(char a[][],int i,int j,char num){
        for(int row=0;row<9;row++){
            if(a[row][j]==num&&row!=i){
                return false;
            }
        }
        return true;
    }
    boolean checkBox(char a[][],int i,int j, char num){
        for(int row=(i/3)*3;row<((i/3)+1)*3;row++){
            for(int col=(j/3)*3;col<((j/3)+1)*3;col++){
                if(a[row][col]==num&&(i!=row||j!=col)){
                    return false;
                }
            }
        }
        return true;
    }
}
