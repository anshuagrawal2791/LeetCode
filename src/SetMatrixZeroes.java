import java.util.HashSet;

/**
 * Created by anshu on 18/06/17.
 */
public class SetMatrixZeroes {

        public void setZeroes(int[][] matrix) {
            HashSet<Integer> colsToZero = new HashSet<>();
            HashSet<Integer> rowsToZero = new HashSet<>();
            int rows= matrix.length;
            if(rows==0)
                return;
            int cols = matrix[0].length;
            for(int i=0;i<rows;i++){
                // boolean flag=false;
                for(int j=0;j<cols;j++){
                    if(matrix[i][j]==0){
                        rowsToZero.add(i);
                        colsToZero.add(j);
                    }
                }
            }
            System.out.println(rowsToZero.toString());
            System.out.println(colsToZero.toString());

            for(int i=0;i<rows;i++){
                //  System.out.println("--"+i+" "+j);

                for(int j=0;j<cols;j++){
                    // System.out.println(i+" "+j);
                    if(rowsToZero.contains(i)||colsToZero.contains(j))
                        matrix[i][j]=0;
                }
            }

        }

}
