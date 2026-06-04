class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r= heights.length-1;
        int w=0,h=0, a=0;
        while(l<r){
            w= r-l;
            h= Math.min(heights[r],heights[l]);
            a= Math.max(a,h*w);
            if(heights[l]<heights[r]){
                l++;
            }else{
                r--;
            }
        }
        return a;
    }
}
