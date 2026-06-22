class Solution {
    public int majorityElement(int[] nums) {
        int curr=0;
        int c=0;
        for(int n: nums){
            if(c==0){
                curr=n;
            }
            if(curr==n){
                c++;
            }else{
                c--;
            }
        }
        return curr;
    }
}