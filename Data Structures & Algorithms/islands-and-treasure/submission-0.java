class Pair{
    int x;
    int y;
    Pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}

class Solution {
    public void islandsAndTreasure(int[][] grid) {
        
        int n= grid.length;
        int m= grid[0].length;
        Queue<Pair> queue= new LinkedList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==0){
                    queue.add(new Pair(i,j));
                }
            }
        }
        int dir[][]={
            {-1,0},{1,0},{0,1},{0,-1}
        };

        while(!queue.isEmpty()){
            Pair pair= queue.poll();
            int f =pair.x;
            int s= pair.y;
            for(int i=0;i<4;i++){
                int newR= f+ dir[i][0];
                int newC= s+ dir[i][1];

                if(newR>=0 && newR<n && newC>=0 && newC<m && grid[newR][newC]==Integer.MAX_VALUE){
                    grid[newR][newC]= grid[f][s] +1;
                    queue.add(new Pair(newR,newC));
                }
            }

        }
    }
}
