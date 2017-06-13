/**
 * Created by anshu on 13/06/17.
 */
public class IsValidSudoku {
    public boolean isValidSudoku(char[][] a) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(a[i][j]!='.'){
                    if(check(a,i,j,a[i][j])==false)
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
