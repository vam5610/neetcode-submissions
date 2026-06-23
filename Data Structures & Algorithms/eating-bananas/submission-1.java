class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MAX_VALUE;
        int r=0;
        for(int n: piles){
            r= Math.max(n,r);
        }  
        int l=1;      
        while(l<=r){
            int mid= l+ (r-l)/2;
            int total=0;
            for(int n: piles){
                total+=(int) Math.ceil((double)n/mid);
            }
            max= Math.min(max, total);
            if(total<=h){
                r=mid-1;
            }else{
                l= mid+1;
            }
        }
        return l;
    }
}
