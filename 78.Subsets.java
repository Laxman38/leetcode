class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerSet = new ArrayList<>();
        int n = nums.length;
        int subsets = 1 << n;

        for(int i = 0; i < subsets; i++) {
            List<Integer> subset = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                if((i & (1<<j)) != 0) {
                    subset.add(nums[j]);
                }
            }
            powerSet.add(subset);
        }
        return powerSet;
    }
}