class Pair{
    int x;
    int y;
    int z;
    Pair(int x,int y, int z){
        this.x=x; 
        this.y=y;
        this.z=z;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> queue= new LinkedList<>();
        int n= grid.length;
        int m= grid[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    queue.add(new Pair(i,j,0));
                }
            }
        }
        
        int dir[][]={
            {-1,0},{1,0},{0,1},{0,-1}
        };
        int time=0;   
        while(!queue.isEmpty()){
            Pair p= queue.poll();
            int f= p.x;
            int s= p.y;
            int t= p.z;
            time= Math.max(t,time);
            for(int i=0;i<4;i++){
                int newR= f+dir[i][0];
                int newC= s+ dir[i][1];
                if(newR>=0 && newR<n && newC>=0 && newC<m && grid[newR][newC]==1){
                    grid[newR][newC] =2;
                    queue.add(new Pair(newR,newC, t+1));
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return time;
    }
}
