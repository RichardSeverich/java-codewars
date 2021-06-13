package codewars.com.richard.matrix;

import java.util.ArrayList;
import java.util.Queue;
import java.util.List;
import java.util.LinkedList;

class MatrixPathGraph {

    MatrixPathGraph(){
    }

    private static boolean isSafe( int i, int j, int[][] M) {
        int N = M.length;
        return !((i < 0 || i >= N)|| (j < 0 || j >= N)|| M[i][j] == 0);
    }

    // Returns true if there is a
    // path from a source (a
    // cell with value 1) to a
    // destination (a cell with
    // value 2)
    public boolean isPath(int[][] M) {
        // Source and destination
        int s = -1, d = -1;
        int N = M.length;
        int V = N * N + 2;
        Graph g = new Graph(V);
        // Create graph with n*n node
        // each cell consider as node
        int k = 1; // Number of current vertex
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (M[i][j] != 0) {
                    // connect all 4 adjacent
                    // cell to current cell
                    if (isSafe(i, j + 1, M)){g.addEdge(k, k + 1);}
                    if (isSafe(i, j - 1, M)){g.addEdge(k, k - 1);}
                    if (i < N - 1 && isSafe(i + 1, j, M)) {g.addEdge(k, k + N);}
                    if (i > 0 && isSafe(i - 1, j, M)){g.addEdge(k, k - N);}
                }
                // source index
                if (M[i][j] == 1) {s = k;}
                // destination index
                if (M[i][j] == 2){d = k;}
                k++;
            }
        }
        // find path Using BFS
        return g.BFS(s, d);
    }
}
