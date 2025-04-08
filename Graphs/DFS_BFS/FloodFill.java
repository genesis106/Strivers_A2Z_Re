package Restart.Graphs.DFS_BFS;

public class FloodFill {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc]==color){return image;}
        color(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    private static void color(int[][] image, int sr, int sc, int color, int toBeColored) {
        image[sr][sc]=color;
        int[][] direction={{0,1},{1,0},{-1,0},{0,-1}};
        for(int i=0;i<4;i++){
            int x=sr+direction[i][0],y=sc+direction[i][1];
            if(!(x<0||y<0||x>=image.length||y>=image[0].length||image[x][y]!=toBeColored)){
                color(image, x, y, color, toBeColored);
            }
        }
    }
    public static void main(String[] args) {
        int[][] f={{0,0,0},{0,0,0}};
        int[][] g=floodFill(f, 0, 0, 0);
        for(int i=0;i<g.length;i++){
            for(int j=0;j<g[0].length;j++){
                System.out.print(g[i][j]+" ");

            }                System.out.println();

        }
    }
}
