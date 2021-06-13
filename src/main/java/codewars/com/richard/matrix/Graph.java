package codewars.com.richard.matrix;

import java.util.ArrayList;
import java.util.Queue;
import java.util.List;
import java.util.LinkedList;

class Graph {
    int V;
    List<List<Integer> > adj;

    Graph(int V) {
        this.V = V;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; i++) {
            adj.add(i, new ArrayList<>());
        }
    }

    // add edge to graph
    public void addEdge(int s, int d) {
        adj.get(s).add(d);
    }

    // BFS function to find path
    // from source to sink
    public boolean BFS(int s, int d) {
        // Base case
        if (s == d){return true;}
        // Mark all the vertices as not visited
        boolean[] visited = new boolean[V];
        // Create a queue for BFS
        Queue<Integer> queue= new LinkedList<>();
        // Mark the current node as visited and
        // enqueue it
        visited[s] = true;
        queue.offer(s);
        // it will be used to get all adjacent
        // vertices of a vertex
        List<Integer> edges;
        while (!queue.isEmpty()) {
            // Dequeue a vertex from queue
            s = queue.poll();
            // Get all adjacent vertices of the
            // dequeued vertex s. If a adjacent has
            // not been visited, then mark it visited
            // and enqueue it
            edges = adj.get(s);
            for (int curr : edges) {
                // If this adjacent node is the
                // destination node, then return true
                if (curr == d){return true;}
                // Else, continue to do BFS
                if (!visited[curr]) {
                    visited[curr] = true;
                    queue.offer(curr);
                }
            }
        }
        // If BFS is complete without visiting d
        return false;
    }
}
