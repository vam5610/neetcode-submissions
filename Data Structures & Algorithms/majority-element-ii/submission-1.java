class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int cnt1=0,cnt2=0;
        int e1=0,e2=0;
        for(int i=0;i<nums.length;i++ ){
            if(cnt1==0 && nums[i]!= e2){
                cnt1=1;
                e1= nums[i];
            }
            else if(cnt2==0 && nums[i]!= e1){
                cnt2=1;
                e2= nums[i];
            }
            else if(nums[i]==e1) cnt1++;
            else if(nums[i]==e2) cnt2++;
            else{
                cnt1--;
                cnt2--;
            }
        }
        List<Integer> res= new ArrayList<>();
        int c1=0,c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==e1)c1++;
            else if(nums[i]==e2) c2++;
        }
        if(c1>nums.length/3) res.add(e1);
        if(c2>nums.length/3) res.add(e2);
        return res;
    }    
    // public List<Integer> majorityElement(int[] nums) {
        // HashMap<Integer, Integer> map= new HashMap<>();
        // int n= nums.length;
        // List<Integer> res= new ArrayList<>();
        // for(int num: nums){
        //     map.put(num, map.getOrDefault(num,0)+1);
        // }
        // for(Map.Entry<Integer,Integer> fmap: map.entrySet()){
        //     if(fmap.getValue()>n/3){
        //         res.add(fmap.getKey());
        //     }
        // }
        // return res;
        
    //}
}