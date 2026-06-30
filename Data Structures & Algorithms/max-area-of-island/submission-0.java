class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n= grid.length;
        int m= grid[0].length;
        int max= 0;
        boolean[][] vis= new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    int res= dfs(grid, vis ,i,j);
                    max= Math.max(max,res); 
                }
            }
        }
        return max;
    }
    public int dfs(int[][] grid,boolean[][] vis, int i,int j){
        int n= grid.length;
        int m= grid[0].length;
         if (i < 0 || i >= n || j < 0 || j >= m ||
            grid[i][j] == 0 || vis[i][j]) {
            return 0;
        }
        vis[i][j]= true;
        return 1 + dfs(grid,vis,i-1,j) + dfs(grid,vis,i,j-1) + dfs(grid,vis,i,j+1)+dfs(grid,vis,i+1,j);
    }
}
