public class MatrixAddition {

    public static int[][] matrixAddition(int[][] a, int[][] b) {

        if(a.length != b.length){
            return null;
        }

        int[][] matrix = new int[a.length][a.length];
        for(int i=0; i < a.length; i++){
         for (int j=0; j < b.length; i++){
             matrix[i][j] = a[i][j] + b[i][j];
         }
        }
        return matrix;
    }
}
