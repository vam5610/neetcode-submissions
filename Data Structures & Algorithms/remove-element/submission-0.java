class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> numbers = new ArrayList<>();

        for (int num : nums) {
            if (num != val) {
                numbers.add(num);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            nums[i] = numbers.get(i);
        }

        return numbers.size();
    }
}