class Solution {
    static HashSet<Integer> set;
    public int longestConsecutive(int[] nums) {
        set= new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int longest=0,len=0;
        for(int num: nums){
            if(set.contains(num)){
                len= findLen(set, num);
                longest= Math.max(len, longest);
            }
        }
        return longest;
    }
    static int findLen(HashSet<Integer> set, int num){
        if(set.contains(num+1)){
            return 1+ findLen(set, num+1);
        }
        return 1;
    }
}
