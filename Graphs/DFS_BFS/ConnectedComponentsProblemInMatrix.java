package Restart.Graphs.DFS_BFS;

import java.util.ArrayList;

public class ConnectedComponentsProblemInMatrix {
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {
        int provinces = 0;
        boolean[] visited = new boolean[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                ++provinces;
                dfs(visited,i,adj);
            }
        }
        return provinces;
    }private static void dfs(boolean[] visited, int row,ArrayList<ArrayList<Integer>> isConnected) {
        visited[row]=true;
        for (int i = 0; i < isConnected.get(row).size(); i++) {
            if(isConnected.get(row).get(i)==1&&!visited[i]){
                dfs(visited, i, isConnected);
            }
        }
    }
}
