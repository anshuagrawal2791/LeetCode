/**
 * Created by anshu on 20/06/17.
 */
public class SearchWordInGrid {
    int rowx[] = new int[]{0,0,1,-1};
    int colx[] = new int[]{1,-1,0,0};
    boolean visited[][];
    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        if(rows==0)
            return false;
        int cols = board[0].length;
        if(word.equals(""))
            return true;
        visited = new boolean[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j]==word.charAt(0)){
                    visited[i][j]=true;
                    if(check(1,word.length(),word,board,i,j,rows,cols))
                        return true;
                    visited[i][j]=false;
                }
            }
        }
        return false;
    }
    boolean check(int i, int n, String word, char[][] board, int row,int col,int rows,int cols){
        // System.out.println(i+" "+n+" "+row+" "+col);
        if(i==n)
            return true;
        for(int x=0;x<4;x++){
            if(isSafe(row+rowx[x],col+colx[x],rows,cols)){
                if(board[row+rowx[x]][col+colx[x]]==word.charAt(i)&&!visited[row+rowx[x]][col+colx[x]]){
                    visited[row+rowx[x]][col+colx[x]]=true;
                    if(check(i+1,n,word,board,row+rowx[x],col+colx[x],rows,cols))
                        return true;
                    visited[row+rowx[x]][col+colx[x]]=false;
                }
            }
        }

        return false;
    }
    boolean isSafe(int i,int j,int rows,int cols){
        return (i>=0&&i<rows&&j>=0&&j<cols);
    }
}
