class Solution {
    public int findJudge(int v, int[][] trust) {
        int n= trust.length;
        int m= trust[0].length;
        int indegree[]= new int[v+1];
        int outdegree[]= new int[v+1];
        for(int t[]: trust){
            int f= t[0];
            int s= t[1];
            outdegree[f]++;
            indegree[s]++;
        }
        for(int i=1;i<=v;i++){
            if(outdegree[i]==0 && indegree[i]==v-1){
                return i;
            }
        }
        return -1;
    }
}