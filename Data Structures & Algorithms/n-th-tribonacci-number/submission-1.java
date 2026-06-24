class Solution {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;
        int f=0,s=1,t=1;
        for(int i=3;i<=n;i++){
            int d= f+s+t;
            f=s;
            s=t;
            t=d;
        }
        return t;
    }
}