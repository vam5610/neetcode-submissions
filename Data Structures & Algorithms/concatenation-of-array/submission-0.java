class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] arr= new int[nums.length + nums.length];
        int n= nums.length+nums.length;
        for(int i=0;i<n;i++){
            arr[i]= nums[i%nums.length];
        }
        return arr;
    }
}