package codewars.com.richard.matrix;

/** */
public class MatrixPathBoolean {

    /**
    * Constructor.
    */
    public MatrixPathBoolean() {

    }

    public boolean isPath(
        int fromRow, int fromColumn, int toRow, int toColumn,
        boolean[][] mapMatrix) {

        int[][] integerMapMatrix = new int[mapMatrix.length][];
        for (int i = 0; i < mapMatrix.length; i++) {
            integerMapMatrix[i] = new int[mapMatrix[i].length];
            for (int j = 0; j < mapMatrix[i].length; j++) { 
                if(mapMatrix[i][j]){
                    integerMapMatrix[i][j] = 3;
                } else {
                    integerMapMatrix[i][j] = 0;
                }
                if(i==fromRow && j==fromColumn){
                  integerMapMatrix[i][j] = 1;
                }
                if(i==toRow && j==toColumn){
                  integerMapMatrix[i][j] = 2;
                }
            }
        }
        MatrixPathGraph matrixPath = new MatrixPathGraph();
        return matrixPath.isPath(integerMapMatrix);
    }
}
