class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> freq = new HashMap<>();

        if(n == 1) return false;

        for(int i = 0; i < n; i++) {
            if(freq.containsKey(nums[i])) {
                if(i - freq.get(nums[i]) <= k) {
                    return true;
                }
            }
            
            freq.put(nums[i], i);
        }

        return false;
    }
}