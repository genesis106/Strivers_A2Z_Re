package Restart.Graphs.DFS_BFS;

public class NumberOfProvinces {
    public int findCircleNum(int[][] isConnected) {
        int provinces = 0;
        boolean[] visited = new boolean[isConnected.length];
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                ++provinces;
                dfs(visited,i,isConnected);
            }
        }
        return provinces;
    }

    private void dfs(boolean[] visited, int row,int[][] isConnected) {
        visited[row]=true;
        for (int i = 0; i < isConnected[row].length; i++) {
            if(isConnected[row][i]==1&&!visited[i]){
                dfs(visited, i, isConnected);
            }
        }
    }
}
