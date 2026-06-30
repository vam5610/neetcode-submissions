class Solution {
    public int islandPerimeter(int[][] grid) {
        
        int n= grid.length;
        int m=grid[0].length;
        int pm= 0;
        int dr[][]= {
            {-1,0},{1,0},{0,1},{0,-1}
        };
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    pm=pm+4;
                    for(int d[]: dr){
                        int newR= i+ d[0];
                        int newC= j+ d[1];
                        if(newR>=0 && newR<n && newC>=0 && newC<m && grid[newR][newC]==1){
                            pm--;
                        }
                    }
                }
            }
        }
        return pm;
    }
}