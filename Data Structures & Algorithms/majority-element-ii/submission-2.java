class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int n :nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int s= nums.length;
        List<Integer> res= new ArrayList<>();
        List<Map.Entry<Integer,Integer>> list= new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Integer,Integer>comparingByValue().reversed());
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>s/3){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}