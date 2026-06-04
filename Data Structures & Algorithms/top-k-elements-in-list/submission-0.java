class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map= new HashMap<>();
        for(int num: nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        List<List<Integer>> arr= new ArrayList<>();
        for(Map.Entry<Integer, Integer>entry: map.entrySet()){
            arr.add(Arrays.asList(entry.getValue(),entry.getKey()));
        }
        Collections.sort(arr,(a,b)->b.get(0)-a.get(0));
        int res[]= new int[k];
        for(int i=0;i<k;i++){
            res[i]= arr.get(i).get(1);
        }
        return res;
    }
}
